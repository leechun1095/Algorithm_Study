const fs = require('fs')
let input = fs.readFileSync('/dev/stdin').toString().split(' ')

let str = input[0].toUpperCase();

let alpah = {}
var a_num = 'A'.charCodeAt(0) // 65
var z_num = 'Z'.charCodeAt(0)
for (let i = a_num; i <= z_num; i++){
    alpah[String.fromCharCode(i)] = 0
}

for (let i = 0; i < str.length; i++){
    var ch = str[i].toUpperCase();

    alpah[ch] += 1
}


let max = -1
let max_ch = '?'
for (var ch in alpah) {
    var num = alpah[ch]

    if (num > max) {
        max = num
        max_ch = ch
    } else if (num == max) {
        max_ch = '?'
    }
}

console.log(max_ch)