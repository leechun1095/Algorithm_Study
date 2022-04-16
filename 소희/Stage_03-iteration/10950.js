const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let cnt = 0;
const input = () => {
  return stdin[cnt++];
};

const solution = () => {
  let len = input();
  while (len--) {
    const arr = input()
      .split(" ")
      .map((x) => parseInt(x));
    console.log(arr[0] + arr[1]);
  }
};

solution();
