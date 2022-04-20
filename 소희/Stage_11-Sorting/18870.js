const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const N = Number(input());
  let rank = 0;
  let prevIdx = 0;
  let arr = input()
    .split(" ")
    .map((elem, idx) => [idx, Number(elem)])
    .sort((a, b) => a[1] - b[1]);
  let result = arr
    .map((elem, idx) => {
      if (elem[1] == arr[prevIdx][1]) return [...elem, rank];
      rank++;
      prevIdx = idx;
      return [...elem, rank];
    })
    .sort((a, b) => a[0] - b[0])
    .map((elem) => elem[2]);
  console.log(result.join(" "));
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
