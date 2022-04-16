const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  let cand = new Array(10000 + 1).fill(1);
  for (let i = 0; i <= 10000; i++) {
    if (i == 0 || i == 1) {
      cand[i] = 0;
      continue;
    }
    for (let j = 2; i * j <= 10000; j++) {
      if (cand[i * j] == 0) continue;
      cand[i * j] = 0;
    }
  }
  let results = [];
  let T = input();
  for (let i = 0; i < T; i++) {
    let n = Number(input());
    let [a, b] = func(n);
    results.push(a + " " + b);
  }
  console.log(results.join("\n"));

  function func(X) {
    let val;
    let mid = Math.floor(X / 2);
    while (!val) {
      if (cand[mid] && cand[X - mid]) {
        val = Math.min(mid, X - mid);
      } else {
        mid--;
      }
    }
    return [val, X - val];
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
