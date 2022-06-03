const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const N = +input();
  const arr = [];
  const dp = [];
  for (let i = 0; i < N; i++) arr[i] = input().split(" ").map(Number);

  let result = 1000 * N;
  for (let selected = 0; selected < 3; selected++) {
    dp[0] = new Array(3).fill(arr[0][selected]);
    for (let i = 1; i < N; i++) {
      dp[i] = [];
      for (let j = 0; j < 3; j++) {
        dp[i][j] = 1000 * (i + 1);
        for (let prev = 0; prev < 3; prev++) {
          if (i == 1) {
            if (j == selected) continue;
          } else {
            if (j == prev) continue;
          }
          if (i == N - 1 && selected == j) continue;
          dp[i][j] = Math.min(dp[i - 1][prev] + arr[i][j], dp[i][j]);
        }
      }
    }
    result = Math.min(...dp[N - 1], result);
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
