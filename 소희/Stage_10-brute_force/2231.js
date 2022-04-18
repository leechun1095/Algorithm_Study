const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const N = Number(input());
  let len = N.toString().length;
  let init = N - 9 * len;
  console.log(search(init, N));

  function search(L, R) {
    while (L <= R) {
      if (getSum(L)) return L;
      L++;
    }
    return 0;
  }

  function getSum(num) {
    let sum = num
      .toString()
      .split("")
      .reduce((sum, elem) => sum + Number(elem), num);
    if (sum == N) return true;
    return false;
  }
};

let _line = 0;
const input = () => stdin[_line++].split(" ").map(Number);

let stdin = [];
rl.on("line", function (line) {
  stdin.push(line);
}).on("close", function () {
  solution();
  process.exit();
});
