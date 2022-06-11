const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const arr = [];
  const dp = [];
  const [N, M] = input().split(" ").map(Number);
  for (let i = 0; i < N; i++) {
    arr[i] = input().split(" ").map(Number);
    dp[i] = [];
    for (let j = 0; j < N; j++) {
      dp[i][j] = arr[i][j];
      if (i !== 0) dp[i][j] += dp[i - 1][j];
      if (j !== 0) dp[i][j] += dp[i][j - 1];
      if (i == 0 || j == 0) continue;
      dp[i][j] -= dp[i - 1][j - 1];
    }
  }

  const results = [];
  for (let i = 0; i < M; i++) {
    const [x1, y1, x2, y2] = input().split(" ").map(Number);
    results.push(sum(x1 - 1, y1 - 1, x2 - 1, y2 - 1));
  }
  console.log(results.join("\n"));

  function sum(r1, c1, r2, c2) {
    let result = dp[r2][c2];
    if (r1 !== 0) result -= dp[r1 - 1][c2];
    if (c1 !== 0) result -= dp[r2][c1 - 1];
    if (r1 === 0 || c1 === 0) return result;
    return result + dp[r1 - 1][c1 - 1];
  }
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
