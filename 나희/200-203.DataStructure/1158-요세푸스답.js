const [n, k] = require("fs").readFileSync("/dev/stdin").toString().split(" ");
// const [n, k] = `7 3`.toString().split(" ");
let arr = Array.from({ length: n }, (v, i) => i + 1);
let answer = "<";
while (arr.length) {
  for (let i = 0; i < k; i++) {
    arr.push(arr.shift());
  }
  if (arr.length === 1) {
    answer += `${arr.pop()}>`;
  } else {
    answer += `${arr.pop()}, `;
  }
}
console.log(answer);
