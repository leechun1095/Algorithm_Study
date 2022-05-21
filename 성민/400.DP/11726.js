const input = `2`;
// const fs = require('fs');
// const input = fs.readFileSync('dev/stdin').toString().trim();
main(+input)
function main(num){
    const arr = [0,1,2];

    for(let i =3; i<=num; i++){
        arr[i] = (arr[i-1] + arr[i-2])%10007;
    }
    console.log(arr[num])
}