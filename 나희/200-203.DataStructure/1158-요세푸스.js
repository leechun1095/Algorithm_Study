// const [n, k] = require("fs").readFileSync("/dev/stdin").toString().split(" ");
const [n, k] = `7 3`.toString().split(" ");
let arr = [];
let count = 1;
let answer = [];
let i = 0;
for (let i = 1; i <= n; i++) {
  arr.push(i);
}
while (answer.length <= n) {
  console.log(
    `시작 answer : ${answer} ,count : ${count}, i : ${i},남은arr : ${arr}`
  );
  if (arr.length <= k) {
    if (i == k) {
      i = i - 1;
      answer.push(...arr.slice(i, 1));
      i = 0;
    }
    console.log("i 값 변화", i);
    while (answer.length <= n) {
      if (i == 0) {
        answer.push(arr.shift());
      } else if (i == k - 1) {
        answer.push(...arr.slice(i, 1));
        i = 0;
      } else {
        answer.push(...arr.slice(i, 1));
      }
      console.log("answer값", answer);
    }
    // while (true) {
    //   if (i == arr.length - 1) {
    //     i = 0;
    //     count += 1;
    //   } else {
    //     count += 1;
    //     i += 1;
    //   }
    // }
    // answer.push(arr.splice(i, 1));
    // if (i >= arr.length - 1) {
    //   answer.push(arr.splice(i, 1));
    //   i = 0;
    // } else {
    //   i += 1;
    // }
    //
    // 현재 인덱스 i-1 로 최초 시작함.
    // 만약 i-1 을 집어넣고 나서 그다음값이 존재하면 i+1, length-1과 i가 같다면 i=0
  } else {
    if (count === +k) {
      answer.push(...arr.splice(i, 1));
      count = 1;
    } else if (i == arr.length - 1) {
      i = 0;
      count += 1;
    } else {
      count += 1;
      i += 1;
    }
  }
}
console.log(answer);
console.log("<", answer.filter((e) => e !== " ").join(", "), ">");
