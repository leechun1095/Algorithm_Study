const input = Number(require("fs").readFileSync("/dev/stdin").toString());
let num = input;
let sum;
let cycle = 0;

while (true) {
  cycle++;
  sum = Math.floor(num / 10) + (num % 10);
  num = (num % 10) * 10 + (sum % 10);
  if (input === num) {
    break;
  }
}
console.log(cycle);
// 중괄호 {break} 써주는게 처리시간 더 적음.
