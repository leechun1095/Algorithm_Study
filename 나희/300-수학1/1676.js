// const input = +require("fs").readFileSync("/dev/stdin").toString();
const input = +`15`.toString();
let count = 0;
function factorial(n) {
  if (n >= 2) {
    return n * factorial(n - 1);
  }
  if (n === 1) {
    return 1;
  }
}
let ans = factorial(input);
ans = ans
  .toString()
  .split("")
  .map((v) => +v)
  .reverse();
console.log(ans);
console.log(ans.length);
for (let i = 0; i < ans.length; i++) {
  if (ans[i] === 0) {
    count += 1;
  } else {
    break;
  }
}
console.log(count);
