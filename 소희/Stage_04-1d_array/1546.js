const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let cnt = 0;
const input = () => {
  return stdin[cnt++];
};

const solution = () => {
  const n = input();
  const arr = input()
    .split(" ")
    .map((x) => parseInt(x));
  let max = -10;
  for (let i = 0; i < n; i++) {
    if (arr[i] > max) {
      max = arr[i];
    }
  }
  let sum = 0;
  for (let i = 0; i < n; i++) {
    arr[i] = (arr[i] / max) * 100;
    sum += arr[i];
  }
  console.log(sum / arr.length);
};

solution();
