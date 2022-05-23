const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const n = input();
  let dp = [0];
  for (let row = 0; row < n; row++) {
    let arr = input().split(" ").map(Number);
    for (let i = 0; i < row + 1; i++) {
      if (i == 0) arr[i] += dp[i];
      else if (i == row) arr[i] += dp[i - 1];
      else arr[i] += Math.max(dp[i - 1], dp[i]);
    }
    dp = arr;
  }
  console.log(Math.max(...dp));
};

let lineNum = 0;
const input = () => stdin[lineNum++];

let stdin = [];
rl.on("line", function (line) {
  stdin.push(line);
}).on("close", function () {
  solution();
  process.exit();
});
