const fs = require('fs');
const inputData = fs.readFileSync('dev/stdin').toString().split(' ');

let H = parseInt(inputData[0])
let M = parseInt(inputData[1])


M = M - 45
if (M<0) {
    H = H - 1
    M = M + 60
}
if (H<0) {
    H = H + 24
}

console.log('%d %d', H, M)