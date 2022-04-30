const input = require("fs").readFileSync("/dev/stdin").toString().split("\n");
// const input = `7
// pop
// top
// push 123
// top
// pop
// top
// pop`.split("\n");

// 배열의 맨 첫번째 요소 빼준다.
const n = +input.shift();
let stack = [];
let count = 0;
let answer = [];
while (count !== n) {
  // console.log(`count: ${count}`);
  // console.log(`stack: ${stack}`);
  let [command, num] = input[count].split(" ");
  // console.log(`command: ${command} num: ${num}`);
  if (command === "push") {
    stack.push(+num);
  } else if (command === "top") {
    answer.push(stack.length > 0 ? stack[stack.length - 1] : -1);
  } else if (command === "size") {
    answer.push(stack.length);
  } else if (command === "empty") {
    answer.push(stack.length === 0 ? 1 : 0);
  } else if (command === "pop") {
    answer.push(stack.length > 0 ? stack.pop() : -1);
  }
  count++;
}
console.log(answer.join("\n"));
