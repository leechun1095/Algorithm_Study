const input = require("fs").readFileSync("dev/stdin").toString().trim();
// const input = "The last character is a blank ".trim();
let arr = input.split(" ");
const result = arr.filter((e) => e !== " ");
console.log(result.length);
