const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const N = input();
  const len = N.length;
  let result = 0;
  for (let i = 1; i < len; i++) result += 9 * 10 ** (i - 1) * i;
  return result + (N - 10 ** (len - 1) + 1) * len;
};

let _line = 0;
const input = () => stdin[_line++];

let stdin = [];
rl.on("line", function (line) {
  stdin.push(line);
}).on("close", function () {
  console.log(solution());
  process.exit();
});
