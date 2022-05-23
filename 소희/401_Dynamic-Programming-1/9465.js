const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  let result = [];
  const T = input();
  for (let i = 0; i < T; i++) {
    let arr = [];
    const n = input();
    arr[0] = input().split(" ").map(Number);
    arr[1] = input().split(" ").map(Number);

    let dp = [];
    dp[0] = [arr[0][0], arr[1][0]];
    dp[1] = [arr[0][1] + arr[1][0], arr[0][0] + arr[1][1]];

    for (let i = 2; i < n; i++) {
      if (!dp[i]) dp[i] = [];
      dp[i][0] = Math.max(dp[i - 1][1], ...dp[i - 2]) + arr[0][i];
      dp[i][1] = Math.max(dp[i - 1][0], ...dp[i - 2]) + arr[1][i];
    }
    result.push(Math.max(...dp[n - 1]));
  }
  console.log(result.join("\n"));
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
