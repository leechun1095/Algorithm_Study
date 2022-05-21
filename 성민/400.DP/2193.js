
const input = `3`;
main(+input)
function main(N){
    const memo = [[0,0],[0,1],[1,0]]

    for(let i =3; i<=N; i++){
        let zero = BigInt(memo[i-1][0]) + BigInt(memo[i-1][1]);
        let one = BigInt(memo[i-1][0])
        memo[i] = [zero,one]
    }

    console.log((memo[N][0] + memo[N][1]).toString())
}