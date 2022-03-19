const fs = require('fs');

const inputData = fs.readFileSync(0, 'utf8').toString().split(' ');

const score = parseInt(inputData[0])

if (score >= 90){
    console.log('A')
} else if (score >= 80){
    console.log('B')
} else if (score >= 70){
    console.log('C')
} else if (score >= 60){
    console.log('D')
} else {
    console.log('F')
}