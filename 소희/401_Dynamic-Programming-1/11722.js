const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const N = input();
  const dp = [];
  const arr = input().split(" ").map(Number);
  let result = 0;

  for (let i = 0; i < N; i++) {
    dp[i] = 1;
    for (let j = 0; j < i; j++) {
      if (arr[j] > arr[i]) dp[i] = Math.max(dp[i], dp[j] + 1);
    }
    result = Math.max(result, dp[i]);
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
