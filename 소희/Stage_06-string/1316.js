const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let cnt = 0;
const input = () => {
  return stdin[cnt++];
};

function isGroupWord(word) {
  const arr = word.split("");
  const set = new Set(arr);
  if (set.size == arr.length) {
    return true;
  }
  for (let i = 0; i < word.length; i++) {
    const arr = word.split("");
    const elem = arr[i];
    const start = arr.indexOf(elem);
    const end = arr.length - arr.reverse().indexOf(elem);
    if (start != end - 1) {
      if ((word.slice(start, end)) != word[start].repeat(end - start)) {
        return false;
      }
    }
  }
  return true;
}

const solution = () => {
  let count = 0;
  let loop = input();
  while (loop--) {
    if (isGroupWord(input())) {
      count++;
    }
  }
  console.log(count);
};

solution();
