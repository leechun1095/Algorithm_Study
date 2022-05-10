const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const GCD = (A, B) => (A % B == 0 ? B : GCD(B, A % B));
const LCM = (A, B) => (A * B) / GCD(A, B);
const solution = () => {
  const T = input();
  let results = [];
  for (let i = 0; i < T; i++) {
    const [A, B] = input()
      .split(" ")
      .map(Number)
      .sort((a, b) => a - b);
    results[i] = LCM(A, B);
  }
  console.log(results.join("\n"));
};

let line = 0;
const input = () => stdin[line++];

let stdin = [];
rl.on("line", function (line) {
  stdin.push(line);
}).on("close", function () {
  solution();
  process.exit();
});
