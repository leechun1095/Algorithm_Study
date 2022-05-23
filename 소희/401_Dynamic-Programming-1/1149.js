const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const N = input();
  let arr = [];
  for (let i = 0; i < N; i++) {
    arr.push(input());
  }
  let dp = [];
  dp[0] = [...arr[0]];
  for (let i = 1; i < N; i++) {
    dp[i] = [];
    for (let j = 0; j < 3; j++) {
      let cand = 1000000;
      for (let k = 0; k < 3; k++) {
        if (j == k) continue;
        cand = Math.min(arr[i][j] + dp[i - 1][k], cand);
      }
      dp[i][j] = cand;
    }
  }
  console.log(Math.min(...dp[N - 1]));
};

let line = 0;
const input = () => stdin[line++].split(" ").map(Number);

let stdin = [];
rl.on("line", function (line) {
  stdin.push(line);
}).on("close", function () {
  solution();
  process.exit();
});
