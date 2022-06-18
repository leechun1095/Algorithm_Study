const fs = require('fs');
let input;
(process.platform === 'linux') ? input = fs.readFileSync('/dev/stdin', 'utf-8').toString().trim().split('\n') : input = fs.readFileSync('input.txt', 'utf-8').split('\r\n');

const [N, M] = Array.from(input[0].split(' '), Number);
const numberArr = Array.from(new Array(N), (x, i) => i + 1);
// console.log(N, M, numberArr)

const arrays = combination(numberArr, M);
arrays.forEach(array => console.log(array.join(' ')));

function combination(array, selectNumber) {
  const results = [];
  if(selectNumber === 1){
    //array로 들어온 배열 원소 중에 한개만 뽑는경우에 하나를 배열로 만들어서 return
    return array.map((element) => [element]);
  }
  array.forEach((fixed, index, origin) => {
      const selectedRestArrs = combination(origin, selectNumber - 1);
      //fixed와 combination으로 추출한 배열을 합쳐서 답으로 내보냄
      const attached = selectedRestArrs.map(selectedRestArr => [fixed, ...selectedRestArr]);
      results.push(...attached);
  });
  return results;
}



/**
 * ===========================================================================
 * ===========================================================================
 * ===========================================================================
 */
// const fs = require('fs');
// let input;
// (process.platform === 'linux') ? input = fs.readFileSync('/dev/stdin', 'utf-8').toString().trim().split('\n') : input = fs.readFileSync('input.txt', 'utf-8').split('\r\n');

// const [N, M] = Array.from(input[0].split(' '), Number);
// const numberArr = Array.from(new Array(N), (x, i) => i + 1);
// // console.log(N, M, numberArr)

// combination(numberArr, M);
// if (M === 1) {
//   numberArr.forEach(number => console.log(number));
// }
// // const arrays = combination(numberArr, M);
// // console.log(arrays)
// // console.log(arrays.length)
// // arrays.forEach(array => console.log(array.join(' ')));

// function combination(array, selectNumber) {
//   const results = [];
//   if(selectNumber === 1){
//     //array로 들어온 배열 원소 중에 한개만 뽑는경우에 하나를 배열로 만들어서 return
//     return array.map((element) => [element]);
//   }
//   array.forEach((fixed, index, origin) => {
//       const selectedRestArrs = combination(origin, selectNumber - 1);
//       //fixed와 combination으로 추출한 배열을 합쳐서 답으로 내보냄
//       const attached = selectedRestArrs.map(selectedRestArr => [fixed, ...selectedRestArr]);
//       if (attached[0].length === M) {
//         attached.forEach(array => console.log(array.join(' ')));
//       } else {
//         results.push(...attached);
//       }
//   });
//   return results;
// }
