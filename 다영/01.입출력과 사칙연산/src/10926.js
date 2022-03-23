const fs = require('fs');

const inputData = fs.readFileSync(0, 'utf8').toString().split(' ');

const name = inputData[0].trim()
console.log(name+'??!')