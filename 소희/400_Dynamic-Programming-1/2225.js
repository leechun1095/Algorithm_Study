const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

function solution() {
  const [N, K] = input().split(" ").map(Number);
  let dp = new Array(K + 1);
  dp[0] = new Array(N + 1).fill(0);
  dp[0][0] = 1;
  dynamic();
  console.log(dp[K][N]);

  function dynamic() {
    for (let i = 1; i <= K; i++) {
      dp[i] = [];
      for (let j = 0; j <= N; j++) {
        dp[i][j] = 0;
        for (let num = 0; num <= j; num++) {
          dp[i][j] += dp[i - 1][j - num];
        }
        dp[i][j] %= 1000000000;
      }
    }
  }
}

let line = 0;
const input = () => stdin[line++];

let stdin = [];
rl.on("line", function (line) {
  stdin.push(line);
}).on("close", function () {
  solution();
  process.exit();
});
