const fs = require("fs");
const num = fs
  .readFileSync("/dev/stdin")
  .toString()
  .split(" ")
  .map((value) => +value);
// let num = 2;
if (num >= 1 && num <= 9) {
  for (i = 1; i < 10; i++) {
    // console.log(num, "*", i, "=", num * i);
    console.log(`${num} * ${i} = ${num * i}`);
  }
}
