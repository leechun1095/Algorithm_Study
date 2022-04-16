const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let cnt = 0;
const input = () => {
  return stdin[cnt++];
};

const solution = () => {
  const loop = input();
  for (let i = 0; i < loop; i++) {
    const arr = input().split("");
    const result = new Array(arr.length);
    let count = 0;
    for (let j = 0; j < arr.length; j++) {
      if (arr[j] == "O") {
        count++;
      } else {
        count = 0;
      }
      result[j] = count;
    }
    let sum = 0;
    for (let i = 0; i < result.length; i++) {
      sum += result[i];
    }
    console.log(sum);
  }
};

solution();
