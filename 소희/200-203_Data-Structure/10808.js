const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const S = input();
  const arr = S.split("")
    .sort()
    .map((char, idx) => S.charCodeAt(idx) - 97);
  let dict = new Array(26).fill(0);
  for (let i = 0; i < arr.length; i++) {
    let elem = arr[i];
    if (!dict[elem]) dict[elem] = 0;
    dict[elem]++;
  }
  console.log(dict.join(" "));
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
