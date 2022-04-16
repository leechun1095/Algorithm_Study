const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const r = Number(input());
  const euclidean = Math.PI * r ** 2;
  const taxicab = (r * 2) ** 2 / 2;
  console.log(euclidean);
  console.log(taxicab);
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
