const n = require("fs").readFileSync("/dev/stdin").toString();
// const n = 5;
let blank = " ";
let str = "*";
let answer = [];
for (i = +n - 1; i >= 0; i--) {
  answer.push(`${blank.repeat(i)} ${str.repeat(+n - i)}`);
}
// 마지막 공백제거
console.log(answer.join("\n"));
