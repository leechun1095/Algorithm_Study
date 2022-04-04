const fs = require('fs')
let input = fs.readFileSync('/dev/stdin').toString().trim().split('\n')


function check (str) {
    let alpha = {}
    let last_ch = str[0]

    for (let i = 0; i < str.length; i++){
        if (alpha[str[i]] && last_ch != str[i]) {
            return false
        } else {
            alpha[str[i]] = true
            last_ch = str[i]
        }
    }

    return true
}

let cnt = 0
let n = parseInt(input[0])
for (let i = 1; i <= n; i++){
    let str = input[i]

    if (check(str)) {
        cnt += 1
    }
}


console.log(cnt)