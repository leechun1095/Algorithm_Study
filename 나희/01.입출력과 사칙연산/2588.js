const fs = require("fs");
const input = fs
  .readFileSync("/dev/stdin")
  .toString()
  .split("\n")
  .map((value) => +value);
const [a, b] = input;

first = a * (b % 10);
second = parseInt(a * parseInt((b % 100) / 10));
third = a * parseInt(b / 100);
// 3번째 자리
console.log(first);
console.log(second);
console.log(third);
console.log(first + second * 10 + third * 100);
