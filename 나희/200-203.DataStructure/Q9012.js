const input = require("fs")
  .readFileSync("/dev/stdin")
  .toString()
  .trim()
  .split("\n");

const n = +input.shift();
let left = 0;
let answer = [];
for (let i = 0; i < n; i++) {
  left = 0;
  for (let j = 0; j < input[i].length; j++) {
    if (input[i][j] === "(") {
      left += 1;
    } else if (left === 0 && input[i][j] === ")") {
      left = -1;
      break;
    } else {
      left -= 1;
    }
  }
  if (left === 0) {
    answer.push("YES");
  } else {
    answer.push("NO");
  }
}
console.log(answer.join("\n"));
