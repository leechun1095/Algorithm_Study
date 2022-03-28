const fs = require('fs')
let input = fs.readFileSync('/dev/stdin').toString().split('\n')

let n = parseInt(input[0])
let arr = input[1].split(' ')

let min = 1000000
let max = -1000000

for (let i = 0; i < n; i++) {
    let num = parseInt(arr[i])

    if (num < min) {
        min = num
    }
    if (num > max) {
        max = num
    }
}

console.log('%d %d', min, max)