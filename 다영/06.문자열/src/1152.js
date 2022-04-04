const fs = require('fs')
let input = fs.readFileSync('/dev/stdin').toString().trim().split(' ')

console.log(input[0] === "" ? 0 : input.length);