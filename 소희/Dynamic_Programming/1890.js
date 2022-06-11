const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const N = input();
  const arr = [];
  const dp = [[1n]];
  for (let i = 0; i < N; i++) arr[i] = input().split(" ").map(Number);
  for (let i = 0; i < N; i++) {
    for (let j = 0; j < N; j++) if (dp[i] && dp[i][j] > 0n) dfs(i, j);
  }
  return dp[N - 1] && dp[N - 1][N - 1] ? dp[N - 1][N - 1].toString() : 0;

  function dfs(r, c) {
    const dist = arr[r][c];
    if (dist === 0) return;
    [
      [r + dist, c],
      [r, c + dist],
    ].forEach(([nr, nc]) => {
      if (nr < 0 || nr >= N || nc < 0 || nc >= N) return;
      if (!dp[nr]) dp[nr] = [];
      if (!dp[nr][nc]) dp[nr][nc] = 0n;
      dp[nr][nc] += dp[r][c];
    });
  }
};

let line = 0;
const input = () => stdin[line++];

let stdin = [];
rl.on("line", function (line) {
  stdin.push(line);
}).on("close", function () {
  console.log(solution());
  process.exit();
});
