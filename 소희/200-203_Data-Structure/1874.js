const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const n = Number(input());
  let arr = [];
  for (let i = 0; i < n; i++) arr[i] = Number(input());
  let used = [];
  let stack = [];
  let result = "";
  let L = 0,
    R = 0;

  while (L <= R) {
    if (R >= n) break;
    if (L == R) pushUntil(arr[L]);
    if (arr[R] >= arr[R + 1]) {
      R++;
    } else {
      popUntil(L, R);
      L = R + 1;
      R = L;
    }
  }
  console.log(result.split("").join("\n"));

  function pushUntil(num) {
    for (let i = 1; i <= num; i++) {
      if (used[i]) continue;
      used[i] = 1;
      result += "+";
      stack.push(i);
    }
  }
  function popUntil(L, R) {
    while (L <= R) {
      let elem = stack.pop();
      if (arr[L++] != elem) {
        console.log("NO");
        process.exit();
      }
      result += "-";
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
