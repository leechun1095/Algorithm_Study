const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let cnt = 0;
const input = () => {
  return stdin[cnt++];
};

const solution = () => {
  const len = input();
  const arr = input().toString().split("");
  let sum = 0;
  for (let i = 0; i < len; i++) {
    sum += parseInt(arr[i]);
  }
  console.log(sum);
};

solution();
