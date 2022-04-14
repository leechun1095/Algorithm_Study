const fs = require('fs')
let input = fs.readFileSync('/dev/stdin').toString().split(' ')


function append_star(n) {
    if (n==1) {
        return ['*']
    }

    let last_n = n/3
    let stars = append_star(last_n)

    square = []
    for (s in stars) {
        square.push(s*3)
    }
    for (s in stars) {
        square.push(s = ' '*(last_n) + s)
    }
    for (s in stars) {
        square.push(s*3)
    }

    return square
}

let n = parseInt(input[0])
let squres = append_star(n)
for (squre in squres) {
    console.log(squre)
}