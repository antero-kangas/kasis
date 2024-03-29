import { rmSync, mkdirSync, readFileSync, writeFileSync, unlinkSync } from 'fs';
import { mp3Manuscript } from './js/mp3Manuscript.js';
import parseManuscript from './js/parseManuscript.js';
import ProcessedManuscript from './js/ProcessedManuscript.js';

async function main(){
	const args = process.argv.slice(2);
	const manuscriptFilename = args[0];
	//const genVoices = args[1];
	console.log("Käsis:", manuscriptFilename)
	//console.log("Äänet:", genVoices)
	const splitted = manuscriptFilename.split("/");
	const name = splitted[splitted.length-1];
	const tmp_results = "tmp_results";
	try {
		rmSync(tmp_results, {recursive: true, force: true});
	} catch (e) {} finally {}; 	
	mkdirSync(tmp_results);
  	//const manuscriptFilename = '/data/data/com.termux/files/home/git/kasis/test/myllyrannan-kaunis-regina.txt';
	const manuscriptText = readFileSync(manuscriptFilename,
				{encoding:'utf8', flag:'r'});
	console.log("manuscriptText")
	const manuscriptJSON = await parseManuscript(manuscriptText);
	const JSONText = JSON.stringify(manuscriptJSON.manuscript, null, 2);

	console.log("manuscriptJSON")
	writeFileSync(tmp_results+"/structure.json", JSONText);
	const processedManuscript = new ProcessedManuscript(manuscriptJSON.manuscript)
	writeFileSync(tmp_results+"/formatted_"+name, processedManuscript.formatted);

	console.log("processedManuscript")
	const spokenJSONText = JSON.stringify(processedManuscript.sound, null, 2);
 	mp3Manuscript(processedManuscript.sound, tmp_results);
	 
	console.log("spokenJSONText")
	writeFileSync(tmp_results+"/sound.json", spokenJSONText);
 	
	console.log("mp3Manuscriptt")
};

main();