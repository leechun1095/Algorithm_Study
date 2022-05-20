const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let cnt = 0;
const input = () => stdin[cnt++];

let stdin = [];
rl.on("line", function (line) {
  stdin.push(line);
}).on("close", function () {
  let T = input();
  let result = [];
  let arr = [];
  arr[1] = 1;
  arr[2] = 2;
  arr[3] = 4;
  for (let i = 4; i <= 11; i++) arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
  while (T--) result.push(arr[input()]);
  console.log(result.join("\n"));
  process.exit();
});
