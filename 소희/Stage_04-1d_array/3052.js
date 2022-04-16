const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let cnt = 0;
const input = () => {
  return stdin[cnt++];
};

const solution = () => {
  const arr = new Array();
  let count = 0;
  for (let i = 0; i < 10; i++) {
    const n = input() % 42;
    if (!arr.includes(n)) {
      arr.push(n);
      count++;
    }
  }
  console.log(count);
};

solution();
