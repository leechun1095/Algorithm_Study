const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let cnt = 0;
const input = () => {
  return stdin[cnt++];
};

const solution = () => {
  const [m, n] = input()
    .split(" ")
    .map((x) => parseInt(x));
  const arr = new Array(n + 1).fill(1, 2, n + 1);
  for (let i = 2; i <= n; i++) {
    if (arr[i]) {
      for (let j = i * i; j <= n; j += i) {
        arr[j] = 0;
      }
    }
  }
  const result = [];
  for (let i = m; i <= n; i++) {
    if (arr[i]) {
      result.push(i);
    }
  }
  console.log(result.join("\n"));
};

solution();
