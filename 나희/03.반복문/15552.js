let input = require("fs").readFileSync("dev/stdin").toString().split("\n");

// let input = `5
// 1 1
// 12 34
// 5 500
// 40 60
// 1000 1000`
//   .toString()
//   .split("\n");
const testCase = Number(input[0]);
let result = "";
for (i = 1; i <= testCase; i++) {
  let [a, b] = input[i].split(" ").map(Number);
  result += a + b + `\n`;
}
console.log(result);
