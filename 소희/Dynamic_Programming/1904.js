const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const N = +input();
  const dp = [1, 1];
  for (let i = 2; i <= N; i++) dp[i] = (dp[i - 1] + dp[i - 2]) % 15746;
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
