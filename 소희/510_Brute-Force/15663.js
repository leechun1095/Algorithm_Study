const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let cnt = 0;
const input = () => stdin[cnt++];

const solution = () => {
  const [N, M] = input().split(" ");
  const arr = input()
    .split(" ")
    .map(Number)
    .sort((a, b) => a - b);

  let used = [];
  let results = [];
  let result = [];
  recFunc(0);
  console.log(results.join("\n"));

  function recFunc(k) {
    if (k == M) return result.join(" ");
    for (let i = 0; i < N; i++) {
      if (used[i]) continue;
      used[i] = 1;
      result.push(arr[i]);
      let sol = recFunc(k + 1);
      result.splice(result.length - 1);
      used[i] = 0;
      if (!sol) continue;
      if (!results.includes(sol)) results.push(sol);
    }
  }
};

let stdin = [];
rl.on("line", function (line) {
  stdin.push(line);
}).on("close", function () {
  solution();
  process.exit();
});
