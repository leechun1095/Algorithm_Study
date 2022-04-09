const fs = require('fs')
let input = fs.readFileSync('/dev/stdin').toString().split(' ')

let A = parseInt(input[0])
let B = parseInt(input[1])
let C = parseInt(input[2])

let margin = C - B
let cnt = Math.floor(A/margin) + 1

console.log(margin <= 0 ? -1 : cnt)