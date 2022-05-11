const input = +require("fs").readFileSync("/dev/stdin").toString().trim();
// const input = +`500`.toString();
let count = 0;
function factorial(n) {
  if (n == 0) {
    return 1;
  }
  return BigInt(n) * BigInt(factorial(n - 1));
}
let answer = factorial(input);
answer = answer
  .toString()
  .split("")
  .map((v) => +v)
  .reverse();
// console.log(answer);
// console.log(answer.length);
for (let i = 0; i < answer.length; i++) {
  if (answer[i] === 0) {
    count += 1;
  } else {
    break;
  }
}
console.log(count);
