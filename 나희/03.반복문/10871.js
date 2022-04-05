let input = require("fs").readFileSync("dev/stdin").toString().split("\n");
// let input = `10 5
// 1 10 4 9 2 3 8 5 7 6`
//   .toString()
//   .split("\n");
const [n, x] = input[0].split(" ");
const answer = input[1].split(" ").filter((e) => +e < x);
console.log(answer.join(" "));
