const n = require("fs").readFileSync("/dev/stdin").toString();
// const n = 5;
let str = "*";
let answer = "";
for (i = 1; i <= +n; i++) {
  answer += `${str.repeat(i)}\n`;
}
console.log(answer);
