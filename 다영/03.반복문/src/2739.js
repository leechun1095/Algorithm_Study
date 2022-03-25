const fs = require('fs')
const inputData = fs.readFileSync(0, 'utf-8').toString().split(' ')

let n = parseInt(inputData[0])

for (let i = 1; i < 10; i++) {
    console.log('%d * %d = %d', n, i, n*i)
}