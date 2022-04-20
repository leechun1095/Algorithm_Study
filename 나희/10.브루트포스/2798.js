// const input = require("fs").readFileSync("dev/stdin").toString().split("\n");
const input = `10 500
93 181 245 214 315 36 185 138 216 295`.split("\n");
const [n, m] = input[0].split(" ");
const array = input[1]
  .split(" ")
  .map(Number)
  .sort(function (a, b) {
    return a - b;
  });
console.log(m);
console.log(array);

let sum = 0;
let maxArray = [];
for (let i = 0; i < n; i++) {
  for (let j = i + 1; j < n; j++) {
    for (let k = j + 1; k < n; k++) {
      sum = +array[i] + +array[j] + +array[k];
      if (m >= sum) {
        maxArray.push(sum);
      }
    }
  }
}

console.log(maxArray);
console.log(Math.max.apply(null, maxArray));
