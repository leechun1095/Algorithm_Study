const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const N = input();
  const num = factorial(N);
  for (let k = 1n; k <= num.toString().length; k += 1n) {
    if (num % 10n ** BigInt(k) != 0) return console.log((k - 1n).toString());
  }
};

function factorial(n) {
  if (n <= 1n) return 1n;
  return BigInt(n) * factorial(n - 1);
}

let line = 0;
const input = () => stdin[line++];

let stdin = [];
rl.on("line", function (line) {
  stdin.push(line);
}).on("close", function () {
  solution();
  process.exit();
});
