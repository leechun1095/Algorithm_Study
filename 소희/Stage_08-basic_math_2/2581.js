const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let cnt = 0;
const input = () => {
  return stdin[cnt++];
};

function isPrime(n) {
  if (n <= 1) {
    return false;
  }
  for (let i = 2; i < n; i++) {
    if (n % i == 0) {
      return false;
    }
  }
  return true;
}

const solution = () => {
  const m = parseInt(input());
  const n = parseInt(input());
  let exist = false,
    sum = 0,
    minVal;
  for (let i = m; i <= n; i++) {
    if (isPrime(i)) {
      sum += i;
      exist = true;
      if (!minVal) {
        minVal = i;
      }
    }
  }
  if (!exist) {
    console.log(-1);
    return;
  }
  console.log(sum);
  console.log(minVal);
};

solution();
