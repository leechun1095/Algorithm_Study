const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const N = +input();
  const arr = [0, ...input().split(" ").map(Number)];

  for (let i = 1; i <= N; i++) {
    for (let j = 0; j <= Math.floor(i / 2); j++) {
      arr[i] = Math.min(arr[i], arr[j] + arr[i - j]);
    }
  }
  console.log(arr[N]);
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
