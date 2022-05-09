const input = require("fs")
  .readFileSync("/dev/stdin")
  .toString()
  .trim()
  .split("\n")
  .map((v) => +v);

let answer = [];
// console.log(input);
let remainder = input.map((v) => v % 42);
// console.log(remainder);
for (let i = 0; i < remainder.length; i++) {
  if (!answer.includes(remainder[i])) {
    answer.push(remainder[i]);
  }
}
console.log(answer.length);
