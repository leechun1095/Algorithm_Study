const fs = require('fs')
let input = fs.readFileSync('/dev/stdin').toString().split(' ')

let n = parseInt(input[0])

let room = 1
let cnt = 1

while (room < n) {
    room = room + cnt * 6
    cnt ++
}

console.log(cnt)