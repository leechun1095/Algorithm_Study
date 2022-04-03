const fs = require('fs')
let input = fs.readFileSync('/dev/stdin').toString().split(' ')

let str = input[0]

let alpah = Array(26)
for (let i = 0; i < 26; i++){
    alpah[i] = -1
}


let a_num = 'a'.charCodeAt(0) // 65

for (let i = 0; i < str.length; i++) {
    var index = str[i].charCodeAt(0) - a_num

    if (alpah[index] == -1) {
        alpah[index] = i
    }
}

let result = alpah.join(' ')
console.log(result)
