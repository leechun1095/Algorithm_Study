const fs = require('fs')
let input = fs.readFileSync('/dev/stdin').toString().split('\n')

let n = parseInt(input[0])
let num_list = input[1].split('')

let sum = 0
for (let i = 0; i < n; i++) {
    sum += parseInt(num_list[i])
}

console.log(sum)