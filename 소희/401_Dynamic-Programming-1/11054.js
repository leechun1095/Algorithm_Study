const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const N = input();
  const arr = input().split(" ").map(Number);
  const forward = dynamic();
  arr.reverse();
  const reversed = dynamic();

  let result = 0;
  for (let i = 0; i < N; i++) {
    result = Math.max(forward[i] + reversed[N - 1 - i], result);
  }
  console.log(result - 1);

  function dynamic() {
    const dp = [];
    for (let i = 0; i < N; i++) {
      if (!dp[i]) dp[i] = 1;
      for (let j = 0; j < i; j++) {
        if (arr[j] < arr[i]) {
          dp[i] = Math.max(dp[i], dp[j] + 1);
        }
      }
    }
    return dp;
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
