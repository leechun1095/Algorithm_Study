const n = require("fs").readFileSync("/dev/stdin").toString();
// const n = 5;
let str = "";
for (i = +n; i > 0; i--) {
  str += i + "\n";
}
console.log(str);
