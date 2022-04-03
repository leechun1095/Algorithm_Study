const fs = require("fs");
const [a, b, c] = fs
  .readFileSync("/dev/stdin")
  .toString()
  .split(" ")
  .map(Number)
  .sort((a, b) => a - b);

if (a === b && b === c) {
  console.log(10000 + a * 1000);
} else if (a === b || b === c) {
  console.log(1000 + b * 100);
} else {
  console.log(c * 100);
}
