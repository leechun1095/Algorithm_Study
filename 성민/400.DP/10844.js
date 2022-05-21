const input = `2`;
// const fs = require('fs');
// const input = fs.readFileSync('dev/stdin').toString().trim()
main(+input);
function main(num){
    const map = [[0,1,1,1,1,1,1,1,1,1]];

    for(let i =1; i<num; i++){
        let tmp = [];
        for(let j = 0; j<10; j++){
            let up = map[i-1][j+1]? map[i-1][j+1] : 0
            let down = map[i-1][j-1]? map[i-1][j-1] : 0
            tmp.push((up+down)%1000000000);
        }
        map.push(tmp)
    }

    console.log(map[num-1].reduce((prev,now)=>(prev + now)%1000000000,0))
}