const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const N = input();
  const arr = input().split(" ").map(Number);
  const dp = [[arr[0], arr[0]]];

  let result = arr[0];
  for (let i = 1; i < N; i++) {
    dp[i] = [];
    dp[i][0] = Math.max(dp[i - 1][0] + arr[i], arr[i]);
    dp[i][1] = dp[i - 1][1] + arr[i];
    if (arr[i] < 0) dp[i][1] = Math.max(dp[i - 1][0], dp[i][1]);
    result = Math.max(...dp[i], result);
  }
  console.log(result);
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
