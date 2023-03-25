import { readFileSync } from 'fs';
import parseManuscript from './js/parseManuscript.js';

async function main(){
	const args = process.argv.slice(2);
	console.log(args)
	const manuscriptFilename = args[0];

  
	// Calling the readFileSync() method
	// to read 'input.txt' file
	const manuscriptText = readFileSync(manuscriptFilename,
				{encoding:'utf8', flag:'r'});
	 
	// Display the file data
	console.log(manuscriptText);

	const manuscriptJSON = await parseManuscript(manuscriptText);
	console.log(manuscriptJSON);
	const json = JSON.stringify(manuscriptJSON.manuscript,null, 2);
	console.log(json)
};

main();