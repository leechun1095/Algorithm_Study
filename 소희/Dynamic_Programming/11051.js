const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const [N, K] = input().split(" ").map(BigInt);
  const dp = [1n];
  for (let i = 1; i <= N; i++) dp[i] = dp[i - 1] * BigInt(i);
  return (((dp[N] / (dp[K] * dp[N - K])) % 10007n) % 10007n).toString();
};

let _line = 0;
const input = () => stdin[_line++];

let stdin = [];
rl.on("line", function (line) {
  stdin.push(line);
}).on("close", function () {
  console.log(solution());
  process.exit();
});
