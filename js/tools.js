
export function joinToStrAndArr (string, array, pair) {
	let str, arr;
	[str, arr] = pair;
	string += str;
	array = array.concat(arr);
	return [string, array]
}

export const sleep = ms => new Promise(resolve => setTimeout(resolve, ms));

export async function retry(fn, retries=10000, err=null) {
	// console.log(retries)
	if (!retries) {
	  return Promise.reject(err);
	}
	return fn().catch(async err => {
		await sleep(100);
		return retry(fn, (retries - 1), err);
	});
}