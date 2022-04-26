const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const str = input();
  let result = "";
  let L = 0;
  let R = str.length;
  while (true) {
    if (L >= R) break;
    if (str[L] == "<") {
      while (true) {
        result += str[L];
        if (str[L] == ">") break;
        L++;
      }
    } else if (str[L] == " ") {
      result += " ";
    } else {
      let temp = "";
      while (true) {
        if (str[L] == "<" || str[L] == " " || L >= R) break;
        temp += str[L];
        L++;
      }
      result += temp.split("").reverse().join("");
      continue;
    }
    L++;
  }
  console.log(result);
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
