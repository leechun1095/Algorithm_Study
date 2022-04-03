const n = require("fs").readFileSync("/dev/stdin").toString();
// const n = 5;
let str = "";
for (i = 1; i <= +n; i++) {
  str += i + "\n";
}
console.log(str);
