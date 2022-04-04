const fs = require('fs')
let input = fs.readFileSync('/dev/stdin').toString().trim().split(' ')

let str = input[0]

let alpha = {}
alpha['c='] = true
alpha['c-'] = true
alpha['dz='] = true
alpha['d-'] = true
alpha['lj'] = true
alpha['nj'] = true
alpha['s='] = true
alpha['z='] = true

let i = 0
let total = 0
while (i < str.length) {
    if (alpha[str.slice(i, i+2)]) {
        total += 1
        i += 2
    } else if (alpha[str.slice(i, i+3)]) {
        total += 1
        i += 3
    } else{
        total += 1
        i += 1
    }
}

console.log(total)