const fs = require('fs');
let input;
(process.platform === 'linux') ? input = fs.readFileSync('/dev/stdin', 'utf-8').toString().trim().split('\n') : input = fs.readFileSync('input.txt', 'utf-8').split('\r\n');

const [N, M] = Array.from(input[0].split(' '), Number);
const numberArr = Array.from(new Array(N), (x, i) => i + 1);
// console.log(N, M, numberArr)

const arrays = combination(numberArr, M);
// console.log(arrays)
// console.log(arrays.length)
arrays.forEach(array => console.log(array.join(' ')));

function combination(array, selectNumber) {
  const results = [];
  if(selectNumber === 1){
      //array로 들어온 배열 원소 중에 한개만 뽑는경우에 하나를 배열로 만들어서 return
      return array.map((element) => [element]);
  }
  array.forEach((fixed, index, origin) => {
      //자기자신을 fixed로 삭제한 rest 배열을 만든다
      const rest = origin.slice(index);
      //3개를 뽑아야했다면 fixed를 한개 뽑았음으로 rest배열에서 2개만 뽑는다
      const selectedRestArrs = combination(rest, selectNumber - 1);
      //fixed와 combination으로 추출한 배열을 합쳐서 답으로 내보냄
      const attached = selectedRestArrs.map(selectedRestArr => [fixed, ...selectedRestArr]);
      results.push(...attached);
  });
  return results;
}
