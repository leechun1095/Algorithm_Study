const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let cnt = 0;
const input = () => {
  return stdin[cnt++];
};

const solution = () => {
  let len = input();
  let answer = "";
  for (let i = len; i > 0; i--) {
    answer += i + "\n";
  }
  console.log(answer);
};

solution();
