let input = require("fs").readFileSync("dev/stdin").toString().split("\n");
let count = Number(input[0]);
let numbers = input[1].split(" ").map((x) => Number(x));
// console.log(numbers);
numbers.sort((a, b) => a - b);
console.log(`${numbers[0]} ${numbers[count - 1]}`);
