const fs = require('fs')
let input = fs.readFileSync('/dev/stdin').toString().split(' ')

let n = parseInt(input[0])

function factorial(n){
    if (n==0){
        return 1
    }

    return n * factorial(n-1)
}

let res = factorial(n)
console.log(res)