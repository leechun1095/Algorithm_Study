const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const N = input();
  let arr = [];
  for (let i = 0; i < N; i++) arr[i] = reverseWord(input().trim().split(" "));
  console.log(arr.join("\n"));
};

const reverseWord = (wordsArr) => {
  return wordsArr.map((word) => word.split("").reverse().join("")).join(" ");
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
