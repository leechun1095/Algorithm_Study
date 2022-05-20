const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const N = input();
  const arr = input().split(" ").map(Number);
  const dp = [{ len: 0, arr: [] }];
  let result = { len: 0, arr: [] };

  for (let i = 0; i < N; i++) {
    dp[i] = { len: 1, arr: [] };
    for (let j = 0; j < i; j++) {
      if (arr[j] >= arr[i]) continue;
      if (dp[j].len < dp[i].len) continue;
      dp[i].len = dp[j].len + 1;
      dp[i].arr = dp[j].arr;
    }
    dp[i].arr = [...dp[i].arr, arr[i]];
    if (dp[i].len > result.len) {
      result.len = dp[i].len;
      result.arr = dp[i].arr;
    }
  }
  console.log(result.len);
  console.log(result.arr.join(" "));
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
