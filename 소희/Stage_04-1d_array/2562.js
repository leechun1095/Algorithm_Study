const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let cnt = 0;
const input = () => {
  return stdin[cnt++];
};

const solution = () => {
  const arr = [];
  let index = 0;
  let max = -10;
  for (let i = 0; i < 9; i++) {
    let n = parseInt(input());
    if (n > max) {
      index = i + 1;
      max = n;
    }
    arr.push(n);
  }
  arr.sort((a, b) => {
    if (a > b) {
      return 1;
    } else {
      return -1;
    }
  });
  console.log(arr[arr.length - 1]);
  console.log(index);
};

solution();
