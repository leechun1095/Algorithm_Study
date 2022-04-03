const input = require("fs").readFileSync("dev/stdin").toString().split("\n");
const testCase = +input[0];
let arr = input[1];
let sum = 0;
for (i = 0; i < testCase; i++) {
  sum += Number(arr[i]);
}
console.log(sum);
