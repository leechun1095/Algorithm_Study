const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let cnt = 0;
const input = () => {
  return stdin[cnt++];
};

const solution = () => {
  const str = input().split("");
  const arr = new Array(26);
  let order = 0;
  let answer = "";
  for (let i = 0; i < str.length; i++) {
    const index = str[i].charCodeAt() - 97;
    if (arr[index] == undefined) {
      arr[index] = order;
    }
    order++;
  }
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] == undefined) {
      arr[i] = "-1";
    }
    answer += arr[i].toString() + " ";
  }
  console.log(answer);
};

solution();
