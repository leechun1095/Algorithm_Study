let nums = new Set([]);
for (let i = 1; i <= 10000; i++) {
    nums.add(i)
}

function is_self(n, nums){
    let total = 0
    for (let i = 0; i < String(n).length; i++){
        total += parseInt(String(n)[i]);
    }
    if (n + total <= 10000) {
        nums.delete(n+total)
    }
}

console.log([...nums].join('\n'));