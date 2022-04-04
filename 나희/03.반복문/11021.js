const input = require("fs").readFileSync("/dev/stdin").toString().split("\n");
// const input = `5
// 1 1
// 2 3
// 3 4
// 9 8
// 5 2`
//   .toString()
//   .split("\n");
answer = "";
for (i = 1; i <= input[0]; i++) {
  [a, b] = input[i].split(" ").map(Number);
  answer += `Case #${i}: ${a + b}\n`;
}
console.log(answer);
