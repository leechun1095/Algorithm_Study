const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let cnt = 0;
const input = () => {
  return stdin[cnt++];
};

const solution = () => {
  const cnt = input();
  for (let i = 0; i < cnt; i++) {
    const arr = input().split(" ").map(x => parseInt(x));
    const floor = arr[2] % arr[0]== 0 ? arr[0] :  arr[2] % arr[0];
    const room = arr[2] / arr[0] == Math.floor(arr[2] / arr[0]) ? (arr[2] / arr[0]) : Math.floor(arr[2] / arr[0])+ 1;
    console.log(floor.toString() + room.toString().padStart(2, '0'));
  }
};

solution();
