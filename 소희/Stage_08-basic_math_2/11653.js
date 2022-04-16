const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let cnt = 0;
const input = () => {
  return stdin[cnt++];
};

const solution = () => {
  let n = input();
  let str = "";
  let i = 2;
  while (1) {
    if (i > n) {
      break;
    }
    if (n % i == 0) {
      n /= i;
      str += i + "\n";
      i = 2;
      if (n == 1) {
        console.log(str);
        break;
      }
      continue;
    }
    i++;
  }
};

solution();
