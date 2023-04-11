import txttomp3 from 'text-to-mp3';
import ffmpeg from 'ffmpeg';
import audioconcat from 'audioconcat'; 
//import promiseRetry from 'promise-retry';
import { rmSync, mkdirSync, readFileSync, writeFileSync, unlinkSync, existsSync } from 'fs';
import { sleep, retry } from './tools.js';
import path from 'path';

const SPLIT = /[.,!?:;()]\s/;
const MAXLEN = 120;

const wait=ms=>new Promise(resolve => setTimeout(resolve, ms));
     
export async function mp3Manuscript (json, dir) {
	console.log("mp3Manuscript-->")
	let attributes = Object.getPrototypeOf(txttomp3).attributes;
	attributes.tl = "Fi-fi";

	let counter = 0;
	let file = "";
	let promises = [];
	let mp3Files = [];
	try {
		mkdirSync(dir+"/speech");
	} catch (e) {

	}
	json.forEach (async speech => {
		if (speech.text) {
			const subtexts = speech.text.split(SPLIT);
			subtexts.forEach(subtext => {
				let subsubtexts = [subtext];

				// console.log("subsubtexts=",subsubtexts)
				if (subtext.length > MAXLEN) {
					subsubtexts = subtext.split(" ");
				} 
				subsubtexts.forEach(async subsubtext => {

					// console.log("subsubtext1=",subsubtext)
					subsubtext = subsubtext.trim();
					// console.log("subsubtext2=",subsubtext)
					//await sleep(10);
					if (!!subsubtext){
						// console.log("subsubtext3=",subsubtext)
						counter++;
						// console.log(counter, subsubtext)
						file =  dir+"/speech/speech"+counter.toString().padStart(5, "0")+".mp3";
						mp3Files.push(path.resolve(file));


						promises.push(retry(txttomp3.saveMP3.bind(null, subsubtext, file),0));

						// console.log("LATEST: promises=",promises)
					}
				})
			})
		}
	});
	console.log("promises1=", promises.length, promises)
	// const results = await Promise.all(promises)

	const p = Promise.all(promises)
	console.log("P=",p)
	p
	 .then(result => console.log(("fullfilled, value:", result)))
	 .catch(error => console.log(("rejected, reason:", error)))
		console.log("-----")
		// console.log("values=", values.length, values)
		console.log("promises2=", promises.length, promises)
		console.log("-----")
	
		// console.log("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nvalmis")
		// console.log("promises", promises)
		// audioconcat(mp3Files)
		// .concat(dir+'/all.mp3')
		// // .audioFilter("atempo=2.0")
		// .on('start', function (command) {
		// 	console.log('ffmpeg process started:', command)
		// })
		// 	.on('error', function (err, stdout, stderr) {
		// 	console.error('Error:', err)
		// 	console.log("stdout:", stdout)
		// 	console.error('ffmpeg stderr:', stderr)
		// 	console.log(promises)
		// })
		// .on('end', function (output) {
		// 	console.error('Audio created in:', output)
		// 	mp3Files.forEach(mp3File => {
		// 	// ffmpeg(mp3Files[0]).audioFilter("afade=t=in:ss=0:d=15").output("af"+mp3File).run();
		// 	})
		// })

	// })
	// }).catch(
	// 	(err) => {
	// 		console.log(err)
	// })	
}