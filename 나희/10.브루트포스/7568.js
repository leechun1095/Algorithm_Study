// const input = require("fs").readFileSync("dev/stdin").toString().split("\n");
const input = `5
55 185
58 183
88 186
60 175
46 155`.split("\n");
const n = +input[0];
let arr = [];
let rank = 1;
let count = 0;
let answer = Array.from({ length: n }, (v) => 0);
for (i = 1; i <= n; i++) {
  [a, b] = input[i].split(" ");
  arr.push({ index: `${i}`, weight: `${a}`, height: `${b}` });
}
// console.log(arr);
let weightArr = arr.sort((a, b) => b.weight - a.weight);
console.log(weightArr);
for (i = 0; i < n - 1; i++) {
  count += 1;
  // console.log(`index: ${weightArr[i].index}`);
  if (
    weightArr[i].weight >= weightArr[i + 1].weight &&
    weightArr[i].height >= weightArr[i + 1].height
  ) {
    answer[weightArr[i].index - 1] = rank;
    rank += 1;
  } else {
    answer[weightArr[i].index - 1] = rank;
  }
  if (i == n - 2) {
    count += 1;
    if (
      weightArr[i].weight >= weightArr[i + 1].weight &&
      weightArr[i].height >= weightArr[i + 1].height
    ) {
      answer[weightArr[i + 1].index - 1] = count;
    } else {
      answer[weightArr[i + 1].index - 1] = rank;
    }
  }
}
console.log(answer.join(" "));
