const fs = require('fs');

const inputData = fs.readFileSync(0, 'utf8').toString().split(' ');

const year = parseInt(inputData[0])
const ad_year = year - 543

console.log(ad_year)