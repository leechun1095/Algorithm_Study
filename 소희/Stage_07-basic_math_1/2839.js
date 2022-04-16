const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let cnt = 0;
const input = () => {
  return stdin[cnt++];
};

const solution = () => {
  let num = input();
  let loops = 0;
  while (1) {
    if (num % 5 == 0) {
      return (num / 5) + loops;
    }
    num -= 3;
    loops++;
    if (num < 0) {
      break;
    }
  }
  return -1;
};

console.log(solution());
