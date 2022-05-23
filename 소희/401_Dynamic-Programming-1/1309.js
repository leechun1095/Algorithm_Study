const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const N = input();
  const dp = [];
  dp[1] = [1, 1, 1];
  for (let i = 2; i <= N; i++) {
    dp[i] = [];
    dp[i][0] = (dp[i - 1][1] + dp[i - 1][2]) % 9901;
    dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % 9901;
    dp[i][2] = (dp[i - 1][0] + dp[i - 1][1] + dp[i - 1][2]) % 9901;
  }
  console.log(dp[N].reduce((sum, elem) => sum + elem) % 9901);
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
