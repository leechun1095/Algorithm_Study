// const fs = require('fs')
// let input = fs.readFileSync('/dev/stdin').toString().split(' ')

// let n = input[0]
let n = '26'
let origin_n = n

let result = 0
console.log('start')
while (true) {
    if (Number(n) < 10 ){
        n += '0'
    }

    let new_n = n.split('')[1] + (Number(n.split('')[0]) + Number(n.split('')[1]))

    if (new_n == origin_n){
        break;
    }
    n = String(new_n)
    result++
}

console.log(result)
