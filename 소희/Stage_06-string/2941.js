const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let cnt = 0;
const input = () => {
  return stdin[cnt++];
};

const alphabets = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="];

const solution = () => {
  let text = input();
  let count = 0;
  alphabets.forEach(x => {
    while (true) {
      if (text.includes(x)) {
        text = text.replace(x, ' ');
        count++;
      } else {
        break;
      }
    }
  })
  text = text.trim().replace(/(\s*)/g, "");
  console.log(count + text.length);
};

solution();
