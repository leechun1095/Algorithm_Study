const fs = require('fs')
let input = fs.readFileSync('/dev/stdin').toString().split('\n')

let a = parseInt(input[0])
let b = parseInt(input[1])
let c = parseInt(input[2])

let num_str = (a * b * c).toString().split('')
let arr = new Array(10).fill(0)

for (let i = 0; i < num_str.length; i++) {
    let num_i = parseInt(num_str[i])

    arr[num_i]++
}

for (let i = 0; i < 10; i++) {
    console.log(arr[i])
}
