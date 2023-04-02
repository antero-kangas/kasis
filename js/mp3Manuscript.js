import txttomp3 from 'text-to-mp3';
import audioconcat from 'audioconcat'; 
import { rmSync, mkdirSync, readFileSync, writeFileSync, unlinkSync } from 'fs';
import { sleep, retry } from './tools.js';

const SPLIT = /[.,!?:;()]\s/;
const MAXLEN = 120;

export default class Mp3Manuscript {
	constructor (json, dir) {
		let attributes = Object.getPrototypeOf(txttomp3).attributes;
		attributes.tl = "Fi-fi";

		let counter = 0;
		let file = "";
		let mp3Files = [];
		mkdirSync(dir+"/speech");
		json.forEach (async speech => {
			if (speech.text) {
				const subtexts = speech.text.split(SPLIT);
				subtexts.forEach(subtext => {
					let subsubtexts = [subtext];
					if (subtext.length > MAXLEN) {
						subsubtexts = subtext.split(" ");
					} 
					subsubtexts.forEach(subsubtext =>{
						subsubtext = subsubtext.trim();
						if (subsubtext){
							counter++;
							console.log(counter, subsubtext)
							file =  dir+"/speech/speech"+counter.toString().padStart(5, "0")+".mp3";
							mp3Files.push(file)
							retry(txttomp3.saveMP3.bind(null, subtext, file));
						}
					})
				})
			}
		});
		const wait = async () => {await sleep(1000)};
		wait()
		// console.log(mp3Files)
		audioconcat(mp3Files)
		.concat(dir+'/all.mp3')
		.on('start', function (command) {
		  console.log('ffmpeg process started:', command)
		})
		.on('error', function (err, stdout, stderr) {
		  console.error('Error:', err)
		  console.error('ffmpeg stderr:', stderr)
		})
		.on('end', function (output) {
		  console.error('Audio created in:', output)
		})
	}
}