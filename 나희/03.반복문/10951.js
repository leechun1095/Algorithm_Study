let input = require("fs").readFileSync("dev/stdin").toString().split("\n");
// let input = `1 1
// 2 3
// 3 4
// 9 8
// 5 2
// 0 0`
//   .toString()
//   .split("\n");
let answer = [];
for (i = 0; i < input.length - 1; i++) {
  let [a, b] = input[i].split(" ").map(Number);
  answer.push(a + b);
}
answer.map((e) => console.log(e));
