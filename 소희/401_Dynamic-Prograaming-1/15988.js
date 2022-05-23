const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const T = input();
  let result = [];
  let dp = [0, 1, 2, 4];
  for (let i = 4; i <= 1000000; i++) {
    dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
    dp[i] %= 1000000009;
  }

  for (let i = 0; i < T; i++) {
    const n = input();
    result.push(dp[n] % 1000000009);
  }
  console.log(result.join("\n"));
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
