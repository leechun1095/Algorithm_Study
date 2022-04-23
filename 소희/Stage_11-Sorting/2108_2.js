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
    let max = 0;
    let maxVal = [];
    arr.forEach((elem, idx) => {
      if (!count[elem]) count[elem] = 0;
      count[elem]++;
      if (count[elem] > max) {
        max = count[elem];
        maxVal = [elem];
      } else if (count[elem] == max) maxVal.push(elem);
    });
    if (maxVal.length == 1) return maxVal[0];
    return maxVal[1];
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
