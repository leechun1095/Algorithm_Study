const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let cnt = 0;
const input = () => {
  return stdin[cnt++];
};

const solution = () => {
  const loop = input();
  for (let i = 0; i < loop; i++) {
    const arr = input()
      .split(" ")
      .map((x) => parseInt(x));

    const n = arr[0];
    let sum = 0;
    let cnt = 0;
    for (let j = 1; j <= n; j++) {
      sum += arr[j];
    }
    const avg = sum / n;
    for (let j = 1; j <= n; j++) {
      if (arr[j] > avg) {
        cnt++;
      }
    }
    console.log(((cnt / n) * 100).toFixed(3) + "%");
  }
};

solution();
