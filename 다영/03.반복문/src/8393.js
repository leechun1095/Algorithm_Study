const fs = require('fs')
const inputData = fs.readFileSync(0, 'utf-8').toString().split(' ')

let n = parseInt(inputData[0])

let total = 0
for(let i=0; i<=n; i++){
    total = total + i
}
console.log('%d', total)