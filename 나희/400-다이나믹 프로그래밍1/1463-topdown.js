const input = Number(
  require("fs").readFileSync("/dev/stdin").toString().trim()
);
// const input = +`4`.toString();
let d = new Array(input + 1).fill(0);
// console.log(d);
function count(n) {
  if (n == 1) return 0;
  if (d[n] > 0) return d[n];
  d[n] = count(n - 1) + 1;
  if (n % 2 == 0) {
    let temp = count(n / 2) + 1;
    if (d[n] > temp) d[n] = temp;
  }
  if (n % 3 == 0) {
    let temp = count(n / 3) + 1;
    if (d[n] > temp) d[n] = temp;
  }
  return d[n];
}
console.log(count(input));
// 왜 1을 먼저 빼야하지? 횟수가 큰 경우를 먼저 저장하고, 작은 경우가 마지막에 저장되도록 경우 3개 나눠준다.
// 런타임 에러 발생-StackSizeExceeded
