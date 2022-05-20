const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const n = Number(input());
  const arr = input().split(" ").map(Number);
  let dp = [...arr];
  let max = dp[0];
  for (let i = 1; i < n; i++) {
    dp[i] = Math.max(dp[i - 1] + arr[i], dp[i]);
    max = Math.max(dp[i], max);
  }
  console.log(max);
};

let line = 0;
const input = () => stdin[line++];

let stdin = [];
rl.on("line", function (line) {
  stdin.push(line);
}).on("close", function () {
  solution();
  process.exit();
});
