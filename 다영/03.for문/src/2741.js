const fs = require('fs')
const inputData = fs.readFileSync('/dev/stdin').toString().split(' ')

let n = parseInt(inputData[0])
let answer = ''
for (let i=1; i<=n; i++) {
    answer += i + '\n'
}
console.log(answer)