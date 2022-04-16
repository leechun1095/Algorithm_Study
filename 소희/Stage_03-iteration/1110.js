const fs = require("fs");
const filePath = process.platform === "linux" ? "dev/stdin" : "input.txt";
const stdin = fs.readFileSync(filePath).toString().split("\n");

let cnt = 0;
const input = () => {
  return stdin[cnt++];
};

const solution = () => {
  let cnt = 0;
  const n = input();
  let arr = [];
  if (n < 10) {
    arr = ["0", n.toString()];
  } else {
    arr = n.split("");
  }
  const initVal = arr[0] + arr[1];

  while (true) {
    const sum = (parseInt(arr[0]) + parseInt(arr[1])).toString();
    arr[0] = arr[1];
    arr[1] = sum[sum.length - 1];
    const newVal = arr[0] + arr[1];
    cnt++;
    if (newVal == initVal) {
      console.log(cnt);
      break;
    }
  }
};

solution();
