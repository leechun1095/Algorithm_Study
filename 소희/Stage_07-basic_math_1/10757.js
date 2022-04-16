const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let cnt = 0;
const input = () => {
  return stdin[cnt++];
};

const solution = () => {
  return input().split(" ").reduce((sum, x) => sum + BigInt(x), BigInt(0));
};

console.log(solution().toString());
