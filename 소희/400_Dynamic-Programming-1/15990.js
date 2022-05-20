const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const T = Number(input());
  const divider = 1000000009;

  let dp = [];
  dp[1] = [1, 1, 0, 0];
  dp[2] = [1, 0, 1, 0];
  dp[3] = [3, 1, 1, 1];

  for (let i = 4; i <= 100000; i++) {
    dp[i] = [];
    dp[i][0] = 0;
    for (let j = 1; j <= 3; j++) {
      dp[i][j] = 0;
      for (let k = 1; k <= 3; k++) {
        if (j == k) continue;
        dp[i][j] += dp[i - j][k];
      }
      dp[i][j] %= divider;
      dp[i][0] += dp[i][j];
    }
    dp[i][0] %= divider;
  }

  let result = [];
  for (let i = 0; i < T; i++) {
    let n = input();
    result[i] = dp[n][0] % divider;
  }
  console.log(result.join("\n"));
};

let _line = 0;
const input = () => stdin[_line++];

let stdin = [];
rl.on("line", function (line) {
  stdin.push(line);
}).on("close", function () {
  solution();
  process.exit();
});
