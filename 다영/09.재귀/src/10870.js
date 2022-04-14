const fs = require('fs')
let input = fs.readFileSync('/dev/stdin').toString().split(' ')

let n = parseInt(input[0])

function f(n){
    if (n==0) {
        return 0
    } else if (n==1) {
        return 1
    }

    return f(n-1) + f(n-2)
}

let res = f(n)
console.log(res)