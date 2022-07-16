// https://www.acmicpc.net/problem/11723
// 메모리초과 에러!!!!
const fs = require('fs');
let input;
(process.platform === 'linux') ? input = fs.readFileSync('/dev/stdin', 'utf-8').toString().trim().split('\n') : input = fs.readFileSync('input.txt', 'utf-8').split('\r\n');
input.shift();
const commandArr = input.map(i => {
  const splited = i.split(' ');
  splited[1] = Number(splited[1]);
  return splited;
})
const set = Array.from(new Array(21), () => 0);
// console.log(commandArr);
// console.log(set);

function calc(set, command) {
  switch (command[0]) {
    case 'add':
      set[command[1]] = 1;
      break;
    case 'remove':
      set[command[1]] = 0;
      break;
    case 'toggle':
      set[command[1]] =  !set[command[1]] * 1;
      break;
    case 'all':
      for (let i = 0; i < set.length; i++) {
        set[i] = 1;
      }
      break;
    case 'empty':
      for (let i = 0; i < set.length; i++) {
        set[i] = 0;
      }
      break;
    default: //check
      console.log(set[command[1]]);
      break;
  }
}
for (let i = 0; i < array.length; i++) {
  calc(set, commandArr[i])
}