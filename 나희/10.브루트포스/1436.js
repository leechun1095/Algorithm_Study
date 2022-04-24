const n = 10;
let num = 666;
let count = 1;
while (count !== n) {
  num++;
  if (String(num).includes("666")) count++;
  console.log(`count : ${count} num: ${num}`);
}
console.log("----");
console.log(num);
