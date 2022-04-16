const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let line = 0;
const input = () => {
  return stdin[line++];
};

const solution = () => {
  let arr = input()
    .toString()
    .split(" ")
    .map((x) => parseInt(x));
  console.log(arr[0] - arr[1]);
};

solution();
