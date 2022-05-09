const input = require("fs")
  .readFileSync("/dev/stdin")
  .toString()
  .trim()
  .split("\n");

const n = +input.shift();
let arr = [];
let answer = [];
for (let i = 0; i < n; i++) {
  let [command, num] = input[i].split(" ");
  if (command === "push_back") {
    arr.push(num);
  } else if (command === "push_front") {
    arr.unshift(num);
  } else if (command === "pop_front") {
    answer.push(arr.length > 0 ? arr.shift() : -1);
  } else if (command === "pop_back") {
    answer.push(arr.length > 0 ? arr.pop() : -1);
  } else if (command === "front") {
    answer.push(arr.length > 0 ? arr[0] : -1);
  } else if (command === "back") {
    answer.push(arr.length > 0 ? arr[arr.length - 1] : -1);
  } else if (command === "size") {
    answer.push(arr.length);
  } else if (command === "empty") {
    answer.push(arr.length === 0 ? 1 : 0);
  }
}
console.log(answer.join("\n"));
