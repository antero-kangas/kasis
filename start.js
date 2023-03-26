import { readFileSync } from 'fs';
import parseManuscript from './js/parseManuscript.js';

async function main(){
	const args = process.argv.slice(2);
	console.log(args)
	//const manuscriptFilename = args[0];

  	const manuscriptFilename = '/data/data/com.termux/files/home/git/kasis/test/myllyrannan-kaunis-regina.txt';
	const manuscriptText = readFileSync(manuscriptFilename,
				{encoding:'utf8', flag:'r'});
	console.log(manuscriptText);

	const manuscriptJSON = await parseManuscript(manuscriptText);
	console.log(manuscriptJSON);
	const json = JSON.stringify(manuscriptJSON.manuscript,null, 2);
	console.log(json)
};

main();