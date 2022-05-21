const input = require("fs")
  .readFileSync("/dev/stdin")
  .toString()
  .split("\n")
  .map((v) => +v);
let arr = [0, 1, 2, 4];
const t = input[0];
for (let j = 1; j <= t; j++) {
  let num = input[j];
  for (let i = 4; i <= num; i++) {
    arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
  }
  console.log(arr[num]);
}
