const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let cnt = 0;
const input = () => {
  return stdin[cnt++];
};

const solution = () => {
  const arr = (input() * input() * input())
    .toString()
    .split("")
    .map((x) => parseInt(x));
  arr.sort();
  for (let idx = 0; idx < 10; idx++) {
    let count = 0;
    arr.forEach((x) => {
      if (x == idx) {
        count++;
      }
    });
    console.log(count);
  }
};

solution();
