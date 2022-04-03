const fs = require('fs')
let input = fs.readFileSync('/dev/stdin').toString().split('\n')

let t = parseInt(input[0])

for (let i = 1; i <= t; i++) {
    let r = parseInt(input[i].split(' ')[0])
    let s = input[i].split(' ')[1]

    let p = ''
    for (let j = 0; j < s.length; j++){
        p += s[j].repeat(r)
    }
    console.log(p)
}