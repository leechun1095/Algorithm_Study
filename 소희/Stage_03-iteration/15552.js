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
  while (len--) {
    const arr = input()
      .split(" ")
      .map((x) => parseInt(x));
    answer += arr[0] + arr[1] + "\n";
  }
  console.log(answer);
};

solution();
