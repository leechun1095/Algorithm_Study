const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let cnt = 0;
const input = () => {
  return stdin[cnt++];
};

const solution = () => {
  const [fixed, variable, profit] = input().split(" ").map(x => parseInt(x));
  function netProfit(n) {
    return (profit - variable) * n;
  }
  if (netProfit(1) <= 0) {
    console.log(-1);
  } else {
    console.log(Math.floor(fixed / netProfit(1)) + 1);
  }
};

solution();
