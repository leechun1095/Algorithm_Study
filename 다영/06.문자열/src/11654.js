const fs = require('fs')
let input = fs.readFileSync('/dev/stdin').toString().split('\n')


console.log(input[0].charCodeAt(0))
