const fs = require('fs')
let input = fs.readFileSync('/dev/stdin').toString().split('\n')


function hansu(num) {
    let result = 0

    for (let i = 1; i <= num; i++){
        if (i<100) {
            result++
            continue;
        }

        let num_list = i.toString()
        let a = parseInt(num_list[1]) - parseInt(num_list[0])
        let b = parseInt(num_list[2]) - parseInt(num_list[1])

        if ( a==b ) {
            result++
        }
    }

    return result
}

n = parseInt(input[0])
num = hansu(n)

console.log(num)
