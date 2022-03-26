const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().trim();
// console.log(input + "??!");
console.log(`${input}??!`);
// trim() 함수없으면 에러 : 문자열의 앞 뒤의 모든 공백을 제거합니다. 공백이란 모든 공백문자(space, tab, NBSP 등)와 모든 개행문자(LF, CR 등)를 의미