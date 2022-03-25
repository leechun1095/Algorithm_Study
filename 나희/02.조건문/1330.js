const fs = require("fs");
const input = fs
  .readFileSync("/dev/stdin")
  .toString()
  .split(" ")
  .map((value) => +value);
// const input = [1, 2];
// @ 구조분해할당으로 풀 수 있었음 @
const [a, b] = input;

if (a < b) {
  console.log("<");
} else if (a > b) {
  console.log(">");
} else {
  console.log("==");
}
