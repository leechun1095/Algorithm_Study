const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let stdin = [];
rl.on("line", function (line) {
  stdin.push(line);
}).on("close", function () {
  const N = Number(stdin[0]);

  let arr = new Array(N + 1);
  arr[1] = new Array(10).fill(1);
  arr[1][0] = 10;

  for (let i = 2; i <= N; i++) {
    arr[i] = [arr[i - 1][0]];
    for (let j = 1; j < 10; j++) {
      arr[i][j] = 0;
      for (let k = 1; k <= j; k++) {
        arr[i][j] += arr[i - 1][k];
      }
      arr[i][j] %= 10007;
      arr[i][0] += arr[i][j];
    }
    arr[i][0] %= 10007;
  }
  console.log(arr[N][0]);
  process.exit();
});
