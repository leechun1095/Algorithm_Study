const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let cnt = 0;
const input = () => {
  return stdin[cnt++];
};

function isPrime(num) {
  if (num <= 1) {
    return false;
  }
  for (let i = 2; i < num; i++) {
    if (num % i == 0) {
      return false;
    }
  }
  return true;
}

const solution = () => {
  input();
  const arr = input().split(" ").map(x => parseInt(x));
  console.log(arr.reduce((cnt, val) => isPrime(val) ? cnt + 1 : cnt, 0));
};

solution();
