const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().split("\n");
// const input = `23 48
// 25`.split("\n");
let [initHoure, initMinute] = input[0].split(" ").map((v) => +v);
let addedMinute = parseInt(input[1]);
let minute = initMinute + addedMinute;
if (minute >= 60) {
  let addedHour = parseInt(minute / 60);
  let houre = h + addedHour;
  minute %= 60;
  if (houre >= 24) {
    houre = houre % 24;
  }
  console.log(`${houre} ${minute}`);
} else {
  console.log(`${initHoure} ${minute}`);
}
