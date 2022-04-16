const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let cnt = 0;
const input = () => {
  return stdin[cnt++];
};

const solution = () => {
  const arr = input().split("").reverse();
  let i = 0;
  let max = -10;
  while (i < arr.length - 2) {
    let num = parseInt(arr[i] + arr[i + 1] + arr[i + 2]);
    if (num > max) {
      max = num;
    }
    i += 4;
  }
  console.log(max);
};

solution();
