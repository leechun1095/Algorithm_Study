const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let cnt = 0;
const input = () => {
  return stdin[cnt++];
};

const solution = () => {
  const n = input();
  let len = 0;

  while (len++ < 9) {
    console.log(n, "*", len, "=", n * len);
  }
};

solution();
