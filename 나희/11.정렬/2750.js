const input = require("fs").readFileSync("/dev/stdin").toString().split("\n");
// const input = `5
// 5
// 2
// 3
// 4
// 1`
//   .toString()
//   .split("\n");
const n = +input[0];
let arr = [];
for (let i = 1; i <= n; i++) {
  arr.push(input[i]);
}
arr = arr.sort((a, b) => a - b);
arr.forEach((e) => console.log(e));
