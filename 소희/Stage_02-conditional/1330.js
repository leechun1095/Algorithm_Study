const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let cnt = 0;
const input = () => {
  return stdin[cnt++];
};

const solution = () => {
  const arr = input()
    .toString()
    .split(" ")
    .map((x) => parseInt(x));
  const a = arr[0];
  const b = arr[1];
  compare(a, b);
};

const compare = (a, b) => {
  if (a < b) {
    console.log("<");
  } else if (a == b) {
    console.log("==");
  } else {
    console.log(">");
  }
};

solution();
