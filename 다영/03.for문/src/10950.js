const fs = require('fs')
let inputData = fs.readFileSync(0, 'utf-8').toString().split('\n')

let n = parseInt(inputData[0])
let a, b

for (let i=1; i<=n; i++) {
    a = parseInt(inputData[i].split(' ')[0])
    b = parseInt(inputData[i].split(' ')[1])

    console.log('%d', a+b)
}