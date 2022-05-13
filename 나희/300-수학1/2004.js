const [n, m] = require("fs")
  .readFileSync("/dev/stdin")
  .toString()
  .split(" ")
  .map((v) => +v);

// const [n, m] = `25 12`
//   .toString()
//   .split(" ")
//   .map((v) => +v);
// console.log(n,m)
const getTwoFive = (x) => {
  let five = 0;
  let two = 0;
  for (let i = 2; i <= x; i *= 2) {
    two += parseInt(x / i);
  }
  for (let i = 5; i <= x; i *= 5) {
    five += parseInt(x / i);
  }
  return [two, five];
};

const [nTwo, nFive] = getTwoFive(n);
const [mTwo, mFive] = getTwoFive(m);
const [nmTwo, nmFive] = getTwoFive(n - m);
const twoCount = nTwo - mTwo - nmTwo;
const fiveCount = nFive - mFive - nmFive;
console.log(Math.min(twoCount, fiveCount));
