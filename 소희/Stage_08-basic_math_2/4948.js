const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

function solution() {
  let dp = new Array(123456 * 2 + 1).fill(1);
  for (let i = 2; i <= 123456 * 2; i++) {
    if (dp[i] == 0) continue;
    for (let j = 1; j < i * j; j++) {
      if (i == j * i) continue;
      if (dp[i * j] == 0) continue;
      if (i * j > 123456 * 2) break;
      dp[i * j] = 0;
    }
  }
  let results = [];
  while (1) {
    let n = Number(input());
    if (n == 0) break;
    let cnt = 0;
    for (let i = n + 1; i <= 2 * n; i++) if (dp[i] == 1) cnt++;
    results.push(cnt);
  }
  console.log(results.join("\n"));
  process.exit();
}

let _line = 0;
let stdin = [];
const input = () => stdin[_line++];
rl.on("line", function (line) {
  stdin.push(line);
}).on("close", function () {
  solution();
});
