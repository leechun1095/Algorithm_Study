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
  arr.sort((a, b) => {
    if (a >= b) {
      return 1;
    } else {
      return -1;
    }
  });
  console.log(arr[0], arr[arr.length - 1]);
};

solution();
