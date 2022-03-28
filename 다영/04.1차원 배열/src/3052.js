const fs = require('fs')
let input = fs.readFileSync('/dev/stdin').toString().split('\n')

let num_set = new Set()

for (let i = 0; i < input.length - 1; i++) {
    let num_42 = parseInt(input[i]) % 42

    num_set.add(num_42)
}

console.log(num_set.size)