const fs = require('fs')
let input = fs.readFileSync('/dev/stdin').toString().trim().split(' ')

let a = input[0]
let b = input[1]

let new_a = parseInt(a[2]+a[1]+a[0])
let new_b = parseInt(b[2]+b[1]+b[0])

if (new_a > new_b){
    console.log(new_a)
} else {
    console.log(new_b)
}