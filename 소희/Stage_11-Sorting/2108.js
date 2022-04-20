const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const mean = (arr) =>
    Math.round(arr.reduce((sum, val) => sum + val, 0) / N, 2);
  const median = (arr) => arr[Math.floor(N / 2)];
  const mode = (arr) => {
    let count = [];
    arr.forEach((elem) => {
      if (!count[elem + 4000]) count[elem + 4000] = 0;
      count[elem + 4000]++;
    });
    let cand = [];
    let maxVal = Math.max(...count.filter((elem) => elem));
    count.forEach((elem, idx) => {
      if (elem == maxVal) cand.push(idx - 4000);
    });
    if (cand.length == 1) return count.indexOf(maxVal) - 4000;
    cand.sort((a, b) => a - b);
    return cand[1];
  };
  const range = (arr) => Math.abs(arr[0] - arr[N - 1]);

  const N = Number(input());
  let arr = [];
  for (let i = 0; i < N; i++) arr[i] = Number(input());
  arr.sort((a, b) => a - b);
  result = [mean(arr), median(arr), mode(arr), range(arr)];
  console.log(result.join("\n"));
};

let _line = 0;
let stdin = [];
const input = () => stdin[_line++];
rl.on("line", function (line) {
  stdin.push(line);
}).on("close", function () {
  solution();
  process.exit();
});
