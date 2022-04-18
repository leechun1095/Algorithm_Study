const n = require("fs").readFileSync("/dev/stdin").toString();
// const n = 5;
let answer = Array.from({ length: n }, (v) => " ");
// let answer = [] * n;
// console.log(answer);
for (i = +n - 1; i >= 0; i--) {
  answer.splice(i, 1, "*");
  console.log(answer.join(""));
}
// 마지막 공백제거
// console.log(answer.join("\n"));
