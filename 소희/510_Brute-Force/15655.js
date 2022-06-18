const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  let results = [];
  let result = [];
  const [N, M] = input().split(" ").map(Number);
  const arr = input()
    .split(" ")
    .map(Number)
    .sort((a, b) => a - b);
  const used = [];
  rec(0, 0);
  return results.map((item) => item.join(" ")).join("\n");

  function rec(k, idx) {
    if (k === M) return results.push([...result]);
    else {
      for (let i = idx; i < N; i++) {
        if (used[i]) continue;
        used[i] = 1;
        result.push(arr[i]);
        rec(k + 1, i);
        used[i] = 0;
        result.splice(result.length - 1);
      }
    }
  }
};

let _line = 0;
const input = () => stdin[_line++];

let stdin = [];
rl.on("line", function (line) {
  stdin.push(line);
}).on("close", function () {
  console.log(solution());
  process.exit();
});
