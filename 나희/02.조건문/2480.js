const fs = require("fs");
const input = fs
  .readFileSync("/dev/stdin")
  .toString()
  .split(" ")
  .map((v) => +v);
// const input = [6, 2, 5];
let sameCount = [];
for (i = 0; i <= 2; i++) {
  for (j = i + 1; j < input.length; j++) {
    // console.log(`i값 : ${i} j값 : ${j}`);
    if (input[i] == input[j]) {
      // console.log(`i값 ${input[i]} j값${input[j]}`);
      sameCount.push(input[i]);
    }
  }

  if (sameCount.length === 2) {
    break;
  }
}
// console.log(`sameCount: ${sameCount}`);
Value = Number(sameCount[0]);
// console.log(Value);
if (sameCount.length == 2) {
  console.log(10000 + Value * 1000);
} else if (sameCount.length == 1) {
  console.log(1000 + Value * 100);
} else {
  maxValue = Math.max(...input);
  console.log(maxValue * 100);
}
