const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const N = input();
  let arr = [];
  for (let i = 0; i < N; i++) arr[i] = input();
  let results = arr.map((cur) => (isRight(cur) ? "YES" : "NO"));
  console.log(results.join("\n"));
};

const isRight = (cur) => {
  let len = cur.length;
  if (cur[len - 1] == "(") return false;
  if (cur[0] == ")") return false;
  let openCnt = 0;
  let closeCnt = 0;
  for (let i = 0; i < len; i++) {
    if (cur[i] == "(") openCnt++;
    else closeCnt++;
    if (closeCnt > openCnt) return false;
    if (openCnt > Math.floor(len / 2)) return false;
  }
  return openCnt === len - openCnt;
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
