const fs = require('fs')
const InputData = fs.readFileSync(0, 'utf-8').toString().split(' ')

let A = parseInt(InputData[0])
let B = parseInt(InputData[1])
let C = parseInt(InputData[2])

let price

if (A==B && B==C){
    price = 10000 + A * 1000
} else if (A==B) {
    price = 1000 + A * 100
} else if (B==C) {
    price = 1000 + B * 100
} else if (C==A) {
    price = 1000 + C * 100
} else {
    let max_num = Math.max(A,B,C)
    price = max_num * 100
}

console.log(price)