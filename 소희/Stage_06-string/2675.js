const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let cnt = 0;
const input = () => {
  return stdin[cnt++];
};

const solution = () => {
  let len = input();
  let answer = "";
  for (let i = 0; i < len; i++) {
    let elem = input().split(" ");
    let arr = elem[1].split("");
    for (let j = 0; j < arr.length; j++) {
      answer += repeatStr(parseInt(elem[0]), arr[j]);
    }
    answer += "\n";
  }
  console.log(answer);
};

function repeatStr(num, str) {
  let result = "";
  for (let i = 0; i < num; i++) {
    result += str;
  }
  return result;
}

solution();
