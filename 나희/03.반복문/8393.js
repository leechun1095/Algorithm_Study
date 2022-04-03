const fs = require("fs");
const n = fs.readFileSync("/dev/stdin").toString().split(" ").map(Number);
let sum = 0;
for (i = 1; i <= n; i++) {
  sum += i;
}
console.log(sum);
