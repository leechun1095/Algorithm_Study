const fs = require('fs');

const inputData = fs.readFileSync(0, 'utf8').toString().split('\n');

const num_a = parseInt(inputData[0])
const B = inputData[1]
const num_b = parseInt(B)

const firstB = parseInt(B[2])
console.log(num_a*firstB)

const scdB = parseInt(B[1]+'0')
console.log(parseInt(num_a*scdB/10))

const trdB = parseInt(B[0]+'00')
console.log(parseInt(num_a*trdB/100))

console.log(num_a*num_b)
