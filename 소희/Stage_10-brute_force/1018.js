const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const [N, M] = input().split(" ").map(Number);
  let arr = [];
  for (let i = 0; i < N; i++) arr[i] = input();
  let result = 64;
  for (let i = 0; i <= N - 8; i++) {
    for (let j = 0; j <= M - 8; j++) {
      result = Math.min(
        result,
        modifyChecker(i, j, "W", "B"),
        modifyChecker(i, j, "B", "W")
      );
    }
  }
  console.log(result);

  function modifyChecker(startRow, startCol, oddVal, evenVal) {
    let cnt = 0;
    for (let i = startRow; i < startRow + 8; i++) {
      if (i % 2 == 0) {
        for (let j = startCol; j < startCol + 8; j++) {
          if (j % 2 == 0) {
            if (arr[i][j] != evenVal) cnt++;
          } else {
            if (arr[i][j] != oddVal) cnt++;
          }
        }
      } else {
        for (let j = startCol; j < startCol + 8; j++) {
          if (j % 2 == 0) {
            if (arr[i][j] != oddVal) cnt++;
          } else {
            if (arr[i][j] != evenVal) cnt++;
          }
        }
      }
    }
    return cnt;
  }
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
