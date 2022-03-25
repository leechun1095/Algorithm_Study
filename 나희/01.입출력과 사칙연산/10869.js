const fs = require("fs");
const input = fs
  .readFileSync("/dev/stdin")
  .toString()
  .split(" ")
  .map((value) => +value);
// const input = [7, 3];
const [A, B] = [...input];
// const [a, b] = [...input];
// const A = +a;
// const B = +b;
// --------------
// 이미 타입 number인데 백준에서 에러 뜨는 이유는? 찾는중..
// console.log(typeof A);
// console.log(typeof a);
console.log(A + B);
console.log(A - B);
console.log(A * B);
console.log(Math.floor(A / B));
console.log(A % B);
