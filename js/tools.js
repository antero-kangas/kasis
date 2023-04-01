
export function joinToStrAndArr (string, array, pair) {
	let str, arr;
	[str, arr] = pair;
	string += str;
	array = array.concat(arr);
	return [string, array]
}
