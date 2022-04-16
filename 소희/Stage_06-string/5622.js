const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let cnt = 0;
const input = () => {
  return stdin[cnt++];
};

const solution = () => {
  const arr = input().split("");
  let sum = 0;
  for (let i = 0; i < arr.length; i++) {
    let code = arr[i].charCodeAt() - 65;
    let button = parseInt(code / 3) + 2;
    if (button >= 7) {
      if (code <= 18) {
        button = 7;
      } else if (code <= 21) {
        button = 8;
      } else {
        button = 9;
      }
    }
    sum += button + 1;
  }
  console.log(sum);
};

solution();
