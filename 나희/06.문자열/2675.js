const input = require("fs").readFileSync("dev/stdin").toString().split("\n");
// let input = `2
// 3 ABC
// 5 /HTP`.split("\n");

// console.log(input);
for (i = 1; i <= +input[0]; i++) {
  let [num, initstring] = input[i].split(" ");
  // let str = Number(num) * string;
  let str = initstring
    .toString()
    .split("")
    .map((e) => e.repeat(num))
    .join("");
  console.log(str);
}
