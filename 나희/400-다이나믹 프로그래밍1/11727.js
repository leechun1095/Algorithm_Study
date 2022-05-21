const input = +require("fs").readFileSync("/dev/stdin").toString().trim();
let arr = [0, 1, 3];
for (let i = 3; i <= input; i++) {
  arr[i] = (arr[i - 1] + arr[i - 2]) % 10007;
}
console.log(arr[input]);
