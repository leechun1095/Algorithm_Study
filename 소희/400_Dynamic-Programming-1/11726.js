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
  let arr = new Array(1000 + 1);
  arr[1] = 1;
  arr[2] = 2;
  arr[3] = 3;
  for (let i = 4; i < 1001; i++) arr[i] = (arr[i - 1] + arr[i - 2]) % 10007;
  console.log(arr[input()]);
  process.exit();
});
