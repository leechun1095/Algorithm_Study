const input = require("fs").readFileSync("/dev/stdin").toString().split("\n");
// const input = `15
// push 1
// push 2
// front
// back
// size
// empty
// pop
// pop
// pop
// size
// empty
// pop
// push 3
// empty
// front`.split("\n");
const n = +input.shift();
let count = 0;
let arr = [];
let answer = [];
while (count !== n) {
  let [command, num] = input[count].split(" ");
  // console.log(command, num);
  switch (command) {
    case "push":
      arr.push(num);
      break;
    case "front":
      answer.push(arr.length > 0 ? arr[0] : -1);
      break;
    case "back":
      answer.push(arr.length > 0 ? arr[arr.length - 1] : -1);
      break;
    case "size":
      answer.push(arr.length);
      break;
    case "empty":
      answer.push(arr.length === 0 ? 1 : 0);
      break;
    case "pop":
      answer.push(arr.length !== 0 ? arr.shift() : -1);
      break;
  }
  count += 1;
}
console.log(answer.join("\n"));
