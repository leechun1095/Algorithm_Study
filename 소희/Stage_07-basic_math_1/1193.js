const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let cnt = 0;
const input = () => {
  return stdin[cnt++];
};

const solution = () => {
  const index = input();
  let sum = 0, stage = 0;
  while (true) {
    stage++;
    sum += stage;
    if (sum >= index) {
      break;
    }
  }
  const lastIndex = sum - stage;
  let row = index - lastIndex;
  if (stage % 2 != 0) {
    row = stage - row + 1;
  }
  console.log(row.toString() + "/" + (stage + 1 - row).toString())
};

solution();
