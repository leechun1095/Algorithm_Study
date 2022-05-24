const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const N = input();
  const arr = input().split(" ").map(Number);
  const dp = [];

  let result = 0;
  for (let i = 0; i < N; i++) {
    dp[i] = arr[i];
    for (let j = 0; j < i; j++) {
      if (arr[j] < arr[i]) dp[i] = Math.max(arr[i] + dp[j], dp[i]);
    }
    result = Math.max(dp[i], result);
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
