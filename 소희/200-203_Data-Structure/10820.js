const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const solution = () => {
  const N = stdin.length;
  let results = [];
  stdin.forEach((line) => {
    let [lower, upper, num, blank] = [0, 0, 0, 0];
    line.split("").forEach((elem) => {
      if (elem == " ") blank++;
      else if (isNaN(elem)) {
        if (elem.toLowerCase() == elem) lower++;
        else upper++;
      } else num++;
    });
    results.push([lower, upper, num, blank].join(" "));
  });
  console.log(results.join("\n"));
};

let _line = 0;
const input = () => stdin[_line++];

let stdin = [];
rl.on("line", function (line) {
  stdin.push(line);
}).on("close", function () {
  solution();
  process.exit();
});
