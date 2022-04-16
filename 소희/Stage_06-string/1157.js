const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let cnt = 0;
const input = () => {
  return stdin[cnt++];
};

const solution = () => {
  const count = new Array(26);
  count.fill(0);
  input()
    .toLowerCase()
    .split("")
    .map((x) => count[x.charCodeAt() - 97]++);
  let answer = 0;
  const max = Math.max.apply(null, count);
  const originalIdx = count.indexOf(max);
  const lastIdx = count.lastIndexOf(max);
  if (originalIdx == lastIdx) {
    answer = originalIdx;
  } else {
    answer = 63 - 97;
  }
  console.log(String.fromCharCode(answer + 97).toUpperCase());
};

solution();
