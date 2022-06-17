const input = `100`
// const fs = require('fs');
// const input = fs.readFileSync('dev/stdin').toString().trim()
main(+input)

function main(Num){
    let count = 0;
    let token = 1;
    while(true){
        let now = Num - token;
        if(now<0){
            break;
        }
        count += now +1;
        token *= 10
    }

    console.log(count)
}

// 1 ~ 100 100
// 10 ~ 100 91
// 100        1