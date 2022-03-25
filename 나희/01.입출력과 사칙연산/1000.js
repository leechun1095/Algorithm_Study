const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().split(" ");
// const input = [1, 2];
const [A, B] = [...input];
// console.log(A, B);
console.log(parseInt(A) + parseInt(B));
