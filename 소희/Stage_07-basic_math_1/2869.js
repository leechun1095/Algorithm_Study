const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let cnt = 0;
const input = () => {
  return stdin[cnt++];
};

const solution = () => {
  const [upStep, downStep, totalStep] = input().split(" ").map(x => parseInt(x));
  const dailyMove = upStep - downStep;

  const beforeLastStep = totalStep - upStep;
  const days = Math.ceil(beforeLastStep / dailyMove);
  console.log(days + 1);
};

solution();
