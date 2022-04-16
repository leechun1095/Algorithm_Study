const fs = require("fs");
const { resourceLimits } = require("worker_threads");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let cnt = 0;
const input = () => {
  return stdin[cnt++];
};

const solution = () => {
  const n = input();
  let count = 0;
  for (let i = 1; i <= n; i++) {
    if (sequence(i)) {
      count++;
    }
  }
  console.log(count);
};

const sequence = (num) => {
  const arr = num
    .toString()
    .split("")
    .map((x) => parseInt(x));
  let d = 0;
  if (arr.length > 1) {
    d = arr[1] - arr[0];
  }

  for (let n = 0; n < arr.length; n++) {
    if (!(arr[n] == arr[0] + d * n)) {
      return false;
    }
  }
  return true;
};

solution();
