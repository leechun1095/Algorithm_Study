const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  let arr = [];
  for (let i = 0; i < 9; i++) arr[i] = Number(input());
  let sum = 0;
  let used = [];
  rec(0);

  function rec(k) {
    if (k >= 8 || sum > 100) return false;
    if (k == 7 && sum == 100) return true;
    for (let i = 0; i < 9; i++) {
      if (used[i]) continue;
      used[i] = arr[i];
      sum += arr[i];
      let temp = rec(k + 1);
      if (temp)
        process.exit(
          console.log(
            used
              .filter((elem) => elem)
              .sort((a, b) => a - b)
              .join("\n")
          )
        );
      used[i] = 0;
      sum -= arr[i];
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
});
