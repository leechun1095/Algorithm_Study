const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const N = input();
  let arr = [];
  for (let i = 0; i < N; i++) arr[i] = input().split(" ");
  arr.sort((a, b) => a[0] - b[0]);
  console.log(arr.map((elem) => elem.join(" ")).join("\n"));
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
