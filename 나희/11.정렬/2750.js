const input = require("fs")
  .readFileSync("/dev/stdin")
  .toString()
  .trim()
  .split("\n")
  .map((num) => parseInt(num));
input.shift();
const sorted = input.sort((a, b) => a - b);
for (let num of sorted) {
  console.log(num);
}
