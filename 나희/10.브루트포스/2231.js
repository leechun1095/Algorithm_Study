const n = +require("fs").readFileSync("/dev/stdin").toString().trim();
let sum = 0;
let array = [];
for (let i = n - 1; i > 0; i--) {
  sum =
    i +
    i
      .toString()
      .split("")
      .map((n) => parseInt(n))
      .reduce((p, c) => p + c, 0);
  // console.log(`i: ${i} sum: ${sum}`);
  if (sum === n) {
    array.push(i);
  }
  if (sum < n / 2) {
    break;
  }
}
if (array.length > 0) {
  console.log(Math.min(...array));
} else {
  console.log(0);
}
