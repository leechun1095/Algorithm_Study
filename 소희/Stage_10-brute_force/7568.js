const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const N = input();
  let arr = [];
  let result = [];
  for (let i = 0; i < N; i++) arr[i] = input().split(" ").map(Number);
  for (let i = 0; i < N; i++) {
    let rank = 1;
    let [weight, height] = arr[i];
    for (let j = 0; j < N; j++) {
      if (weight < arr[j][0] && height < arr[j][1]) rank++;
    }
    result[i] = rank;
  }
  console.log(result.join(" "));
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
