const fs = require('fs')
const inputData = fs.readFileSync('/dev/stdin').toString().split(' ')

let n = parseInt(inputData[0])
let answer = ''
for (let i=n; i>0; i--) {
    answer += i + '\n'
}
console.log(answer)