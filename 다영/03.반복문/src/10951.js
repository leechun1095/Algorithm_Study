const fs = require('fs')
let input = fs.readFileSync('/dev/stdin').toString().split('\n')


let i = 0
while (i < input.length-1) {
    let a = Number(input[i].split(' ')[0])
    let b = Number(input[i].split(' ')[1])

    console.log(a+b)
    i++
}
