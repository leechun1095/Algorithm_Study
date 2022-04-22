const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const N = input();
  let i = 666;
  let idx = 0;
  let result = [];
  while (true) {
    if (idx == N + 1) break;
    if ((i + "").includes("666")) {
      result[idx] = i + "";
      idx++;
    }
    i++;
  }
  console.log(result[N - 1]);
};

let _line = 0;
const input = () => stdin[_line++];

let stdin = [];
rl.on("line", function (line) {
  stdin.push(line);
}).on("close", function () {
  solution();
  process.exit();
});
