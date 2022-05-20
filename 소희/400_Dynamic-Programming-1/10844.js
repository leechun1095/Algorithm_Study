const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const N = input();
  const dp = [];
  dp[1] = [0, 1, 1, 1, 1, 1, 1, 1, 1, 1];
  for (let i = 2; i <= N; i++) {
    dp[i] = [];
    for (let j = 0; j <= 9; j++) {
      dp[i][j] = 0;
      if (j >= 1) dp[i][j] += dp[i - 1][j - 1];
      if (j < 9) dp[i][j] += dp[i - 1][j + 1];
      dp[i][j] %= 1000000000;
    }
  }
  console.log(dp[N].reduce((sum, elem) => sum + elem, 0) % 1000000000);
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
