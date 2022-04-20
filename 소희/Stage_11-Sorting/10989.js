const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const N = input();
  let arr = [];
  for (let i = 0; i < N; i++) {
    let elem = input();
    if (!arr[elem]) arr[elem] = 0;
    arr[elem]++;
  }
  let result = [];
  arr.forEach((elem, idx) => {
    for (let i = 0; i < elem; i++) result.push(idx);
  });
  console.log(result.join("\n"));
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
