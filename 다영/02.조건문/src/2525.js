const fs = require('fs');
const inputData = fs.readFileSync('dev/stdin').toString().split('\n');

let A = parseInt(inputData[0].split(' ')[0])
let B = parseInt(inputData[0].split(' ')[1])
let C = parseInt(inputData[1])


let H = parseInt(C/60)
let M = C%60

H = A + H
M = B + M

if (M>=60) {
    M = M - 60
    H = H + 1
} else if (M<0) {
    M = M + 60
    H = H -1
}

if (H>=24) {
    H = H - 24
} else if (H<0) {
    H = H + 24
}

console.log('%d %d', H, M)