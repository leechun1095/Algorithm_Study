const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  let dp = [0, 0];
  const X = input();
  run(2);
  console.log(dp[X]);

  function run(n) {
    while (n <= 1000000) {
      if (n % 3 == 0) {
        dp[n] = dp[n / 3] + 1;
      }
      if (n % 2 == 0) {
        if (!dp[n]) dp[n] = dp[n / 2] + 1;
        dp[n] = Math.min(dp[n], dp[n / 2] + 1);
      }
      if (!dp[n]) dp[n] = dp[n - 1] + 1;
      dp[n] = Math.min(dp[n], dp[n - 1] + 1);
      n++;
    }
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
