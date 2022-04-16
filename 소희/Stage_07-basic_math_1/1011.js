const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let cnt = 0;
const input = () => stdin[cnt++];

let stdin = [];
rl.on("line", function (line) {
  stdin.push(line);
}).on("close", function () {
  const N = input();
  let results = [];
  for (let i = 0; i < N; i++) {
    const [start, end] = input().split(" ");
    const dist = end - start;
    results.push(solution(dist));
  }
  console.log(results.join("\n"));
  process.exit();
});

const solution = (dist) => {
  let i = 1,
    sum = 0,
    halfDist = dist / 2;
  while (true) {
    sum += i;
    if (sum >= halfDist) {
      sum -= i;
      let move = (i - 1) * 2;
      let leftDist = (halfDist - sum) * 2;
      if (leftDist == 0) return move;
      if (leftDist > i) {
        move += 2;
      } else {
        move += 1;
      }
      return move;
    }
    i++;
  }
};
