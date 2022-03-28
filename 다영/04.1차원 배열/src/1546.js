const fs = require('fs')
let input = fs.readFileSync('/dev/stdin').toString().split('\n')

let n = parseInt(input[0])
let scoreList = input[1].split(' ')

let M = -1
for (let i = 0; i < n; i++) {
    let score = parseInt(scoreList[i])

    if (M < score) {
        M = score
    }
}

let total = 0
for (let i = 0; i < n; i++) {
    total += parseInt(scoreList[i])/M*100
}

console.log(total/n)