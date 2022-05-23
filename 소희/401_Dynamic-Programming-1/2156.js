const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const n = input();
  let arr = [];
  let dp = [];
  for (let i = 0; i < n; i++) {
    dp[i] = [0, 0];
    arr.push(Number(input()));
  }
  dp[0] = [0, arr[0]];
  dp[1] = [arr[0], arr[0] + arr[1]];
  for (let i = 2; i < n; i++) {
    dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
    dp[i][1] = arr[i] + Math.max(dp[i - 2][0] + arr[i - 1], dp[i - 1][0]);
  }
  console.log(Math.max(...dp[n - 1]));
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
