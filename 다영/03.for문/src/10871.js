const fs = require('fs')
let input = fs.readFileSync('/dev/stdin').toString().split('\n')

let num = input[0].split(' ')
let n = Number(num[0])
let x = Number(num[1])

num = input[1].split(' ')
answer = ''
for (let i = 0; i < n ; i++){
    if (Number(num[i]) < x) {
        answer += Number(num[i]) + ' '
    }
}

console.log(answer)