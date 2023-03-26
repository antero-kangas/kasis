import { readFileSync, writeFileSync } from 'fs';
import parseManuscript from './js/parseManuscript.js';
import FormattedManuscript from './js/formattedManuscript.js';

async function main(){
	const args = process.argv.slice(2);
	console.log(args)
	const manuscriptFilename = args[0];

  	//const manuscriptFilename = '/data/data/com.termux/files/home/git/kasis/test/myllyrannan-kaunis-regina.txt';
	const manuscriptText = readFileSync(manuscriptFilename,
				{encoding:'utf8', flag:'r'});
	//console.log(manuscriptText);

	const manuscriptJSON = await parseManuscript(manuscriptText);
	//console.log(manuscriptJSON);
	const jsonText = JSON.stringify(manuscriptJSON.manuscript,null, 2);
	//console.log(jsonText)
	writeFileSync("tmp.json", jsonText);
	const formattedManuscript = new FormattedManuscript(manuscriptJSON.manuscript).output;
	console.log("formattedManuscript");
	console.log(formattedManuscript);
};

main();