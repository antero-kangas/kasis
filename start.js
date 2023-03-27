import { readFileSync, writeFileSync } from 'fs';
import parseManuscript from './js/parseManuscript.js';
import ProcessedManuscript from './js/ProcessedManuscript.js';

async function main(){
	const args = process.argv.slice(2);
	const manuscriptFilename = args[0];
	const splitted = manuscriptFilename.split("/");
	const name = splitted[splitted.length-1];

  	//const manuscriptFilename = '/data/data/com.termux/files/home/git/kasis/test/myllyrannan-kaunis-regina.txt';
	const manuscriptText = readFileSync(manuscriptFilename,
				{encoding:'utf8', flag:'r'});

	const manuscriptJSON = await parseManuscript(manuscriptText);
	const JSONText = JSON.stringify(manuscriptJSON.manuscript, null, 2);

	writeFileSync("structure.json", JSONText);
	const processedManuscript = new ProcessedManuscript(manuscriptJSON.manuscript)
	writeFileSync("formatted_"+name, processedManuscript.formatted);

	const spokenJSONText = JSON.stringify(processedManuscript.sound, null, 2);
	writeFileSync("sound.json", spokenJSONText);
};

main();