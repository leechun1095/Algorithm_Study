const fs = require("fs");
const input = fs
  .readFileSync("/dev/stdin")
  .toString()
  .split(" ")
  .map((value) => +value);
const score = parseInt(input / 10);
switch (score) {
  case 10:
  case 9:
    console.log("A");
    break;
  case 8:
    console.log("B");
    break;
  case 7:
    console.log("C");
    break;
  case 6:
    console.log("D");
    break;
  default:
    console.log("F");
}
