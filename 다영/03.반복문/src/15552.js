const fs = require('fs')
let inputData = fs.readFileSync(0, 'utf-8').toString().split('\n')

let t = Number(inputData[0])
let answer = ''

for (let i=1; i<=t; i++) {
    let num = inputData[i].split(' ')

    answer += Number(num[0]) + Number(num[1]) + '\n'
}

console.log(answer)