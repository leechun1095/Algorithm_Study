const n = require("fs")
  .readFileSync("dev/stdin")
  .toString()
  .split("")
  .map(Number);
// const n = 1;
let sum = 0;
let array = [];
for (let i = n - 1; i > 0; i--) {
  sum = i + parseInt(i / 100) + (parseInt(i / 10) % 10) + (i % 10);
  // console.log(`i: ${i} sum: ${sum}`);
  if (sum === n) {
    array.push(i);
  }
  if (sum < n / 2) {
    break;
  }
}
if (array.length > 0) {
  console.log(Math.min(...array));
} else {
  console.log(0);
}
