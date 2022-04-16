const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const [x1, y1, r1, x2, y2, r2] = input().split(" ").map(Number);
  const dist = Math.sqrt((x1 - x2) ** 2 + (y1 - y2) ** 2);
  const sum = r1 + r2;
  const diff = Math.abs(r1 - r2);
  if (dist == 0 && diff == 0) return -1;
  if (dist < diff) {
    return 0;
  } else if (dist < sum) {
    if (dist == diff) return 1;
    return 2;
  } else {
    if (dist == sum) return 1;
    return 0;
  }
};

let _line = 0;
const input = () => stdin[_line++];

let stdin = [];
rl.on("line", function (line) {
  stdin.push(line);
}).on("close", function () {
  let T = Number(input());
  let result = [];
  while (T--) {
    result.push(solution());
  }
  console.log(result.join("\n"));
  process.exit();
});
