let input =
require("fs")
  .readFileSync("dev/stdin")
  .toString()
  .split("\n")
  .map((v) => +v);
// let input = `3
// 29
// 38
// 12
// 57
// 74
// 40
// 85
// 61`
//   .split("\n")
//   .map((v) => +v);
// console.log(input);
const maxValue = Math.max(...input);
console.log(maxValue);
const maxIndex = input.findIndex((element) => {
  return element === maxValue;
});
console.log(maxIndex + 1);
