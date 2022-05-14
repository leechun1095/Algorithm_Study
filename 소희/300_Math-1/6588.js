const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

// 에라토스테네스의 체
let isPrime = new Array(1000000 + 1).fill(1);
isPrime[1] = 0;
for (let i = 2; i <= 1000000; i++) {
  for (let j = i * i; j <= 1000000; j += i) isPrime[j] = 0;
}

const solution = () => {
  let results = [];
  while (1) {
    let n = Number(input());
    if (n == 0) break;
    let result = search(2, n - 1, n);
    results.push(`${n} = ${n - result} + ${result}`);
  }
  console.log(results.join("\n"));
};

function search(L, R, n) {
  while (L <= R) {
    let L = n - R;
    if (isPrime[L] && isPrime[R]) {
      return R;
    } else R -= 2;
  }
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
