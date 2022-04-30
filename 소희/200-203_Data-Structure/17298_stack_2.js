const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const N = Number(input());
  let arr = input().split(" ").map(Number);
  let results = new Array(N).fill(-1);
  NGE();
  console.log(results.join(" "));

  function NGE() {
    let stack = [];
    for (let curIdx = 0; curIdx < N; curIdx++) {
      if (arr[curIdx] > arr[stack[stack.length - 1]]) {
        while (arr[stack[stack.length - 1]] < arr[curIdx]) {
          results[stack.pop()] = arr[curIdx];
        }
      }
      stack.push(curIdx);
    }
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
