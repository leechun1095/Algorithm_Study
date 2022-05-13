const input = +require("fs").readFileSync("/dev/stdin").toString().trim();
// const input = +`10`.toString();
function factorial(n) {
  if (n == 0) {
    return 1;
  }
  return BigInt(n) * BigInt(factorial(n - 1));
}
console.log(factorial(input).toString());
