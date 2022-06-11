const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const dp = [];
const solution = () => {
  let arr = [];
  let results = [];
  while (true) {
    const [a, b, c] = input().split(" ").map(Number);
    if (a === -1 && b === -1 && c === -1) break;
    if (!dp[a]) dp[a] = [];
    if (!dp[a][b]) dp[a][b] = [];
    arr.push([a, b, c]);
    const result = w(a, b, c);
    dp[a][b][c] = result;
    results.push(result);
  }
  console.log(
    results.map((elem, idx) => `w(${arr[idx].join(", ")}) = ${elem}`).join("\n")
  );
};

function w(a, b, c) {
  if (dp[a] && dp[a][b] && dp[a][b][c]) return dp[a][b][c];
  if (!dp[a]) dp[a] = [];
  if (!dp[a][b]) dp[a][b] = [];
  if (a <= 0 || b <= 0 || c <= 0) {
    dp[a][b][c] = 1;
  } else if (a > 20 || b > 20 || c > 20) {
    dp[a][b][c] = w(20, 20, 20);
  } else if (a < b && b < c) {
    dp[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
  } else {
    dp[a][b][c] =
      w(a - 1, b, c) +
      w(a - 1, b - 1, c) +
      w(a - 1, b, c - 1) -
      w(a - 1, b - 1, c - 1);
  }
  return dp[a][b][c];
}

let _line = 0;
const input = () => stdin[_line++];

let stdin = [];
rl.on("line", function (line) {
  stdin.push(line);
}).on("close", function () {
  solution();
  process.exit();
});
