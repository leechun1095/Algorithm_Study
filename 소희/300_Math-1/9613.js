const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const GCD = (a, b) => (a % b == 0 ? b : GCD(b, a % b));
const solution = () => {
  const t = input();
  let results = [];
  let used = [];
  let n, arr, cand, sum;
  for (let i = 0; i < t; i++) {
    [n, ...arr] = input().split(" ").map(Number);
    arr.sort((a, b) => a - b);
    cand = [];
    sum = 0;
    rec(0);
    results.push(sum);
  }
  console.log(results.join("\n"));

  function rec(k, startIdx = 0) {
    if (k == 2) return GCD(cand[1], cand[0]);
    for (let i = startIdx; i < n; i++) {
      if (used[i]) continue;
      used[i] = 1;
      cand.push(arr[i]);
      let temp = rec(k + 1, i);
      if (temp) sum += temp;
      used[i] = 0;
      cand.splice(cand.length - 1);
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
