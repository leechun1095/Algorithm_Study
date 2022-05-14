const input = require("fs").readFileSync("/dev/stdin").toString().split("\n");
// const input = `7
// 1 2 5 7 9 11 13`
//   .toString()
//   .split("\n");

const n = input[0];
const arr = input[1].split(" ").map((v) => +v);
let count = 0;

function primeNumber(n) {
  if (n < 2) {
    return;
  }
  for (let j = 2; j < parseInt(n / 2) + 1; j++) {
    if (n % j === 0) return;
  }
  count += 1;
}
for (let i = 0; i < n; i++) {
  primeNumber(arr[i]);
}

console.log(count);
