const fs = require("fs");
const input = fs
  .readFileSync("/dev/stdin")
  .toString()
  .split(" ")
  .map((value) => +value);

let [h, m] = input;
// console.log(h, m);
if (h > 0 && m < 45) {
  h -= 1;
  console.log(h, 60 + m - 45);
} else if (h == 0 && m < 45) {
  console.log(23, 60 + m - 45);
} else {
  console.log(h, m - 45);
}
