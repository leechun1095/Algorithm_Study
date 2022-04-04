const fs = require('fs')
let input = fs.readFileSync('/dev/stdin').toString().trim().split(' ')

let num_dict = {}
num_dict['A'] = 3
num_dict['B'] = 3
num_dict['C'] = 3
num_dict['D'] = 4
num_dict['E'] = 4
num_dict['F'] = 4
num_dict['G'] = 5
num_dict['H'] = 5
num_dict['I'] = 5
num_dict['J'] = 6
num_dict['K'] = 6
num_dict['L'] = 6
num_dict['M'] = 7
num_dict['N'] = 7
num_dict['O'] = 7
num_dict['P'] = 8
num_dict['Q'] = 8
num_dict['R'] = 8
num_dict['S'] = 8
num_dict['T'] = 9
num_dict['U'] = 9
num_dict['V'] = 9
num_dict['W'] = 10
num_dict['X'] = 10
num_dict['Y'] = 10
num_dict['Z'] = 10

let str = input[0]

let sum = 0
for (let i = 0; i<str.length; i++) {
    sum += num_dict[str[i]]
}

console.log(sum)