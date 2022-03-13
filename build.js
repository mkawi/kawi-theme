const fs = require("fs");
const colors = require("./src/colors");

const files = ["kawi-nightshade-dark.json", "kawi-nightshade-dark-italic.json"];

files.forEach((file) => {
	let text = fs.readFileSync(`./src/${file}`, "utf8");

	Object.entries(colors).forEach(([colorVar, hexStr]) => {
		text = text.replace(new RegExp(`\\${colorVar}`, "g"), hexStr);
	});

	fs.writeFileSync(`./themes/${file}`, text);
});
