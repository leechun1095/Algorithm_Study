const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let cnt = 0;
const input = () => {
  return stdin[cnt++];
};

const solution = () => {
  let len = input();
  let result = "";
  for (let i = 0; i < len; i++) {
    const arr = input()
      .split(" ")
      .map((x) => parseInt(x));
    result += `Case #${i + 1}: ${arr[0]} + ${arr[1]} = ${arr[0] + arr[1]}\n`;
  }
  console.log(result);
};

solution();
