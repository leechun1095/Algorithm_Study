const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let cnt = 0;
const input = () => {
  return stdin[cnt++];
};

const solution = () => {
  const time = input()
    .split(" ")
    .map((x) => parseInt(x));

  let h = time[0];
  let m = time[1];

  if (m >= 45) {
    m -= 45;
  } else {
    h--;
    m += 60 - 45;
  }
  if (h < 0) {
    h += 24;
  }

  console.log(h, m);
};

solution();
