const fs = require("fs");
const { PassThrough } = require("stream");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let cnt = 0;
const input = () => {
  return stdin[cnt++];
};

const solution = () => {
  let blank = 0;
  const arr = input()
    .split(" ")
    .map((x) => {
      if (x == "") {
        blank++;
      }
    });
  console.log(arr.length - blank);
};

solution();
