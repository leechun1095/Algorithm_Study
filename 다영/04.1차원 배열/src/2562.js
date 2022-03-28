const fs = require('fs')
let input = fs.readFileSync('/dev/stdin').toString().split('\n')

let max = 0
let idx = 0

for (let i=0; i < input.length; i++) {
    let num = parseInt(input[i])

    if (num > max) {
        max = num
        idx = i+1
    }
}

console.log('%d\n%d', max, idx)
