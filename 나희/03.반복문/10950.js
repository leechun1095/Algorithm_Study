let input = require("fs").readFileSync("dev/stdin").toString().split("\n");
// let info = `5
// 1 1
// 2 3
// 3 4
// 9 8
// 5 2`;
// let input = info.toString().split("\n");
let t = parseInt(input[0]);
for (i = 1; i <= t; i++) {
  [a, b] = input[i].split(" ").map((v) => +v);
  console.log(a + b);
}
