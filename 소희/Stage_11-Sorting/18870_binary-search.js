const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const N = Number(input());
  let initArr = input().split(" ").map(Number);
  let rank = {};
  let results = [];
  let arr = Array.from(new Set([...initArr].sort((a, b) => a - b)));
  arr.forEach((value) => {
    rank[value] = binarySearch(0, arr.length, value);
  });
  initArr.forEach((value) => results.push(rank[value]));
  console.log(results.join(" "));

  function binarySearch(L, R, X) {
    let result = R;
    while (L <= R) {
      let mid = Math.floor((L + R) / 2);
      if (arr[mid] < X) {
        L = mid + 1;
      } else {
        result = mid;
        R = mid - 1;
      }
    }
    return result;
  }
};

let _line = 0;
const input = () => stdin[_line++];

let stdin = [];
rl.on("line", function (line) {
  stdin.push(line);
}).on("close", function () {
  solution();
  process.exit();
});
