const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  let arr = [[], []];
  let result = [];
  for (let i = 0; i < 3; i++) {
    let temp = input();
    arr[0].push(temp[0]);
    arr[1].push(temp[1]);
  }
  let xCnt = [],
    yCnt = [];
  arr[0].forEach((elem) => {
    if (!xCnt[elem]) xCnt[elem] = 0;
    xCnt[elem]++;
  });
  arr[1].forEach((elem) => {
    if (!yCnt[elem]) yCnt[elem] = 0;
    yCnt[elem]++;
  });
  for (let i = 0; i < 3; i++) {
    if (xCnt[arr[0][i]] == 1) result[0] = arr[0][i];
    if (yCnt[arr[1][i]] == 1) result[1] = arr[1][i];
  }
  console.log(result.join(" "));
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
