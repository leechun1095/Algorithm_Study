const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let cnt = 0;
const input = () => {
  return stdin[cnt++];
};

const solution = () => {
  const count = input();
  for (let i = 0; i < count; i++) {
    const apt = {};
    const floors = input();
    const rooms = input();
    for (let i = 0; i <= floors; i++) {
      for (let j = 0; j < rooms; j++) {
        if (!apt[i]) {
          apt[i] = [];
        }
        if (i == 0) {
          apt[i].push(j + 1);
        } else {
          if (j == 0) {
            apt[i].push(apt[i-1][j]);
          } else {
            apt[i].push(apt[i][j - 1] + apt[i-1][j]);
          }
        }
      }
    }
    console.log(apt[floors][rooms - 1]);
  }
};

solution();
