const input = require("fs").readFileSync("/dev/stdin").toString().split("\n");
// const input = `2
// I am happy today
// We want to win the first prize`.split("\n");
const n = +input.shift();
let count = 0;
let wordArr = [];
while (count !== n) {
  // console.log("input", input[count]);
  wordArr = input[count].split(" ");
  console.log(reverseStr(wordArr).join(" "));
  count++;
}

function reverseStr(arr) {
  for (let i = 0; i < arr.length; i++) {
    // console.log(`i: ${i}`);
    let result = "";
    for (let j = arr[i].length - 1; j >= 0; j--) {
      result += arr[i][j];
    }
    if (arr[i] !== result) {
      arr[i] = result;
    }
  }
  return arr;
}
