const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const N = input();
  const price = input().split(" ").map(Number);
  let dp = new Array(N + 1).fill(0);
  price.forEach((elem, idx) => (dp[idx + 1] = elem));
  dynamic();
  console.log(dp[N]);

  function dynamic() {
    for (let X = 1; X <= N; X++) {
      let max = dp[X];
      for (let i = 0; i < N; i++) {
        let index = i + 1;
        if (X - index <= 0) continue;
        max = Math.max(dp[index] + dp[X - index], max);
      }
      dp[X] = max;
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
