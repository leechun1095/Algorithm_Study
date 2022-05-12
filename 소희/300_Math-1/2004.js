const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const [n, m] = input().split(" ");
  let results = [0, 0];
  numCounter(n);
  numCounter(n - m, -1);
  numCounter(m, -1);
  console.log(Math.min(...results));

  function numCounter(target, mul = 1) {
    let cnt = [0n, 0n];
    [2n, 5n].forEach((elem, index) => {
      for (let i = elem; i <= BigInt(target); i *= elem) {
        cnt[index] += BigInt(target) / i;
      }
    });
    cnt.forEach((elem, idx) => (results[idx] += mul * elem.toString()));
  }
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
