const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const GCM = (a, b) => (a % b == 0 ? b : GCM(b, a % b));
const solution = () => {
  const [A, B] = input()
    .split(" ")
    .map(Number)
    .sort((a, b) => a - b);
  const gcm = GCM(A, B);
  const lcd = (A * B) / gcm;
  console.log([gcm, lcd].join("\n"));
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
