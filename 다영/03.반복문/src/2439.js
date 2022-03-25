const fs = require('fs')
const input = fs.readFileSync('/dev/stdin').toString().split(' ')

let n = Number(input[0])
for (let i = 1; i <= n; i++) {
    let star = ' '.repeat(n-i) + '*'.repeat(i)
    console.log(star)
}