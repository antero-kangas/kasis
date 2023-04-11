

export async function tts(text, file, { lang = 'fi-fi', speed = 1.0, rate = 1.0 , volume=1.0} = {}) {
	retry(txttomp3.saveMP3.bind(subtext, file));
}
