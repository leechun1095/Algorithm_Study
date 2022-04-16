const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let cnt = 0;
const input = () => {
  return stdin[cnt++];
};

const solution = () => {
  let sum = 0;
  const last = input();
  for (let i = 1; i <= last; i++) {
    sum += i;
  }
  console.log(sum);
};

solution();
