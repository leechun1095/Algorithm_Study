const fs = require('fs')
let input = fs.readFileSync('/dev/stdin').toString().split('\n')

let c = parseInt(input[0])

for (let i = 1; i <= c; i++) {
    let arr = input[i].split()
    let n = parseInt(arr[0])

    let total = 0
    for (let i = 1; i <= n; i++) {
        total += parseInt(arr[i])
    }

    let avg = total/n
    let num_stdnt = 0
    for (let i = 1; i <= n; i++) {
        if (parseInt(arr[i]) > avg) {
            num_stdnt++
        }
    }

    let stdnt_avg = (num_stdnt/n*100).toFixed(3)
    console.log(stdnt_avg)
}