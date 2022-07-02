/*
인덱스 i가 0보다 크고, a[i-1] >=a[i] 를 만족하면, 인덱스i를 1씩 반복적으로 감소시킨다.
반복문을 벗어난 후, 인덱스 i가 0이면, 다음 순열이 존재하지 않으므로 false를 반환한다.
a[i-1] >= a[j] 를 만족하면, 인덱스 j를 1씩 반복적으로 감소시킨다.
a[i-1]의 값과a[j]의 값을맞바꾼다.
a[i]부터 순열의 마지막까지 순서를뒤집는다.
마지막으로 true를 반환한다. 다음 순열은 배열 a에 저장되어 있다.
 */
const input = `4
1 4 3 2`.split('\n').map(val => val.split(' ').map(Number));

// const fs = require('fs');
// const input= fs.readFileSync('dev/stdin').toString().trim().split('\n').map(val => val.split(' ').map(Number));

main(input[0][0],input[1])
function main(N,Arr){
    let idx = N-1;
    while(idx>0){
        if(Arr[idx-1]>=Arr[idx]){
            idx--
        }else{
            break;
        }
    }
    if(idx === 0){
        console.log(-1);
        return;
    }
    let j = N-1;
    while(Arr[j] < Arr[idx-1]){
        j--;
    }
    [Arr[idx-1],Arr[j]] = [Arr[j],Arr[idx-1]]
    console.log([
        ...Arr.slice(0,idx),
        ...Arr.slice(idx).sort((a,b)=>a-b)
    ].join(' '))
}