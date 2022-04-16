const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let cnt = 0;
const input = () => {
  return stdin[cnt++];
};

const solution = () => {
  let roomNum = input();
  let loop = 0, count = 1;
  while (++loop) {
    count += 6 * (loop - 1);
    if (count >= roomNum) {
      break;
    }
  }
  console.log(loop);
};

solution();
