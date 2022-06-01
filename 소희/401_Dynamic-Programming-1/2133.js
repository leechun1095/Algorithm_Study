const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const N = input();
  const dp = [1, 0, 3];
  for (let i = 3; i <= N; i++) {
    if (i % 2 == 0) {
      dp[i] = dp[i - 2] * 3;
      for (let j = 4; j <= i; j += 2) dp[i] += dp[i - j] * 2;
    } else dp[i] = 0;
  }
  console.log(dp[N]);
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
