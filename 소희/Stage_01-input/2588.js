const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let cnt = 0;
const input = () => {
  return stdin[cnt++];
};

const solution = () => {
  const a = input();
  let sum = 0;
  let n = 0;
  [...input()].reverse().forEach((x) => {
    console.log(a * x);
    sum += a * x * Math.pow(10, n);
    n++;
  });
  console.log(sum);
};

solution();
