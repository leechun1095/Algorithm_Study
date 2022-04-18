const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const [N, M] = input();
  const arr = input();
  let result = 0;
  let used = [];
  rec(0, 0);
  console.log(result);

  function rec(k, sum) {
    if (sum > M) return false;
    if (k + 1 > 3) return sum;
    for (let i = 0; i < N; i++) {
      if (used[i]) continue;
      used[i] = 1;
      let temp = rec(k + 1, sum + arr[i]);
      used[i] = 0;
      if (!temp) continue;
      result = Math.max(temp, result);
    }
  }
};

let _line = 0;
const input = () => stdin[_line++].split(" ").map(Number);

let stdin = [];
rl.on("line", function (line) {
  stdin.push(line);
}).on("close", function () {
  solution();
  process.exit();
});
