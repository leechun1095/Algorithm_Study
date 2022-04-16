const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let cnt = 0;
const input = () => {
  return stdin[cnt++];
};

const solution = () => {
  let result = "";
  let arr = input()
    .split(" ")
    .map((x) => parseInt(x));
  const len = arr[0];
  const x = arr[1];
  arr = input()
    .split(" ")
    .map((x) => parseInt(x));
  for (let i = 0; i < len; i++) {
    if (arr[i] < x) {
      result += arr[i] + " ";
    }
  }
  console.log(result);
};

solution();
