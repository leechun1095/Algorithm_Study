const fs = require('fs')
let input = fs.readFileSync('/dev/stdin').toString().split('\n')

let t = parseInt(input[0])
for (let i = 1; i <= t; i++) {
    let num = input[i].split(' ')

    console.log('Case #%d: %d + %d = %d', i, Number(num[0]), Number(num[1]), Number(num[0]) + Number(num[1]))
}
