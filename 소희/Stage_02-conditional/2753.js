const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let cnt = 0;
const input = () => {
  return stdin[cnt++];
};

const solution = () => {
  const year = input();
  if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
    console.log(1);
  } else {
    console.log(0);
  }
};

solution();
