const input = require("fs").readFileSync("dev/stdin").toString().trim();
// const input = "baekjoon";
let result = [];
for (i = "a".charCodeAt(); i <= "z".charCodeAt(); i++) {
  // a 부터 z 까지 아스키코드를 통해 반복문으로 표현가능
  // 해당 아스키코드를 문자값으로 바꿔서 가지고 있는 경우를 확인
  // 이때, indexOf를 통해 값을 갖고있는 경우 해당 값의 인덱스 반환 , 없다면 -1 반환
  result.push(input.indexOf(String.fromCharCode(i)));
}
console.log(result.join(" "));
