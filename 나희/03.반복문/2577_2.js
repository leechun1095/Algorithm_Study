const [a, b, c] = require("fs")
  .readFileSync("dev/stdin")
  .toString()
  .split("\n");
let result = (a * b * c)
  .toString()
  .split("")
  .map(Number)
  .sort((a, b) => a - b);
// console.log(result);
// 1-9 까지 각 숫자 몇 개인지 체크
let answer = [];
// 각 숫자 돌기
for (i = 0; i <= 9; i++) {
  // result 배열 원소를 돌며 i와 같은 값을 anseer배열에 넣어준다.
  answer = result.filter((element) => element === i);
  console.log(answer.length);
}
