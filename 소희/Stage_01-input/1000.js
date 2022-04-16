const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let line = 0;
const input = () => {
  return stdin[line++];
};

const solution = () => {
  let sum = 0;
  input()
    .toString()
    .split(" ")
    .forEach((num) => (sum += parseInt(num)));
  return sum;
};

console.log(solution());
