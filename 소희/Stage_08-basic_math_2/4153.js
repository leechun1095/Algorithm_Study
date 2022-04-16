const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  let result = [];
  while (1) {
    const [a, b, c] = input();
    if (a == 0 && b == 0 && c == 0) break;
    let temp = [a, b, c];
    temp.sort((x, y) => x - y);
    if (temp[2] ** 2 == temp[0] ** 2 + temp[1] ** 2) {
      result.push("right");
    } else {
      result.push("wrong");
    }
  }
  console.log(result.join("\n"));
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
