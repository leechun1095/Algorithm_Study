const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const N = input();
  let dp = [0, 1];
  for (let n = 1; n <= N; n++) {
    let cand = [];
    if (n ** 2 <= N) dp[n ** 2] = 1;
    if (!dp[n]) dp[n] = n;
    for (let i = 1; i ** 2 <= n; i++) cand.push(i ** 2);
    cand.forEach((elem) => {
      dp[n] = Math.min(dp[n - elem] + dp[elem], dp[n]);
    });
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
