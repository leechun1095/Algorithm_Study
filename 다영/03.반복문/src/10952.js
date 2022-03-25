const fs = require('fs')
let input = fs.readFileSync('/dev/stdin').toString().split('\n')

let i = 0
while (true) {
    let a = Number(input[i].split(' ')[0])
    let b = Number(input[i].split(' ')[1])
    if ((a==0) && (b==0)){
        break;
    }

    console.log(a+b)
    i++
}