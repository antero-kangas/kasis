
export function joinToStrAndArr (string, array, pair) {
	let str, arr;
	[str, arr] = pair;
	string += str;
	array = array.concat(arr);
	return [string, array]
}

export const sleep = ms => new Promise(resolve => setTimeout(resolve, ms));

let prevID=0;
let ids = []; 
const MS = 100;

function indexOfaa(arr, e1) {
	for (let index=0; index < arr.length; index++) {
		if (arr[index][0] === e1) {
			return index
		}
	}
	return -1;
} 


export async function retry_orig(fn, retries=100, id=0, err=null) {
	if (id===0) {
		id = prevID++;  
		ids.push([id, retries, "data"])
	} else {
		console.log("retrial", id, retries, err)
	}
	if (!retries) {
	  return Promise.reject(err);
	}
	const retval = fn().catch(async err => {
		await sleep(MS);
		return retry(fn, (retries - 1), id, err);
	})
	.then((data) => {
		const index = indexOfaa(ids, id);
		if (index >=0 && ids[index][1] > retries && !!data) {
			ids[index][2] = data
		}
		// console.log(id, ids.length, "retries=", retries, ids.sort(function(a, b){return a[0] - b[0]}).reverse())
		// console.log(id, ids.length, "retries=", retries, ids.sort(function(a, b){return a[0] - b[0]}))
		return data
	});

	const index = indexOfaa(ids, id);
	if (index >= 0 && ids[index][1] >= retries) {
		ids[index][1] = retries
		ids[index][2] = retval
	} else {
		console.log("id", id, "ei löydy")
	}
	return 
}

export async function retry2(fn, retries=100, id=0, err=null) {
	if (id===0) {
		id = prevID++;  
		ids.push([id, retries, 'Promise { <pending> }'])
	}
	if (!retries) {
	  return Promise.reject(err);
	}
	const retval = fn().catch(async err => {
			await sleep(MS);
			return retry(fn, (retries - 1), id, err);
		// }
	})

	console.log("retval=", retval)
	const index = indexOfaa(ids, id);
	if (ids[index] && ids[index][1] >= retries && !!retval) {
		ids[index][2] = retval
	}
	let count=0;
	for (let i=0; i<ids.length;i++) {
		if (ids[i][2] + "" !== 'Promise { <pending> }') count++
	}

	console.log(id, ids.length, "retries=", retries, "count=", count)
	
	// console.log(id, ids.length, "retries=", retries, ids.sort(function(a, b){return a[0] - b[0]}).reverse())
	// console.log(id, ids.length, "retries=", retries, ids.sort(function(a, b){return a[0] - b[0]}))
	if (ids[index] && ids[index][2]) return ids[index][2]
}

export async function retry3 (fn, id=0, retries=1000) {
	return new Promise((resolve, reject) => { 
		console.log("retry id=", id, "retries=", retries)
		if (id === 0) {
			id = prevID++;
			ids.push([id, retries, 'Promise { <pending> }'])
		} else {
			const index = indexOfaa(ids, id);
			if (ids[index] && retries < ids[index][1]) {
				ids[index][1] = retries
			}
		}
		console.log(ids)
		return fn()
		.then(resolve)
		.catch(async () => {
			console.log("failed, retrying", id, retries)
			if (!retries) {
				return reject('maximum retries exceeded');
			}
			await sleep(MS)
			const retval = await retry(fn, id, retries-1).then(resolve);
			console.log(id, retries, retval)
			const index = indexOfaa(ids, id);
			if (ids[index] && retries <= ids[index][1]) {
				ids[index][1] = retries
				ids[index][2] = retval
			}
			return ids[index][2]
		})
	})
};

export const wait = (ms) => new Promise((resolve) => setTimeout(resolve, ms  || 0));

export const retry = async (fn, id=0,retries=100, retryIntervalMs=100) => {
	console.log("retry start1:", id, retries)
	if (id===0) {
		id = ++prevID;
	}
	console.log("retry start2:", id, retries)
	const retval = fn().catch(async (error) => {
		console.log("catch error=", id, retries)
		if (retries > 0) {
			console.log("-->retry")
			// retries--;
			// setTimeout(retry, retryIntervalMs)
			wait(retryIntervalMs).then(() => 
				retry(fn, id, retries-1, retryIntervalMs)
			)
		} else {

			console.log("-->failed",)
			return Promise.reject(error)
		}
	})
	console.log("retval=", id, retries, retval)
	return retval
}

