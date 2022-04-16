const fs = require("fs");
const { resourceLimits } = require("worker_threads");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let cnt = 0;
const input = () => {
  return stdin[cnt++];
};

function selfSum(i) {
  const arr = i.toString().split("");
  let sum = i;
  for (let i = 0; i < arr.length; i++) {
    sum += parseInt(arr[i]);
  }
  return sum;
}

const solution = () => {
  const max = 10000;
  const result = new Array(max + 1);
  for (let i = 1; i <= max; i++) {
    const sum = selfSum(i);
    if (sum <= max) {
      result[sum] = 1;
    }
  }
  for (let i = 1; i <= max; i++) {
    if (result[i] != 1) {
      console.log(i);
    }
  }
};

solution();
