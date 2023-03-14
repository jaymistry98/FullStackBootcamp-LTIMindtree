
/* let add = function(x,y){
    return x + y
}
console.log(add(12,13))

//Arrow
let add2 = (x,y) => x+y
console.log(add2(12,13)) 
*/


/* let numbers = [5,8,2,7,1]
numbers.sort(function(a,b) {
    return b-a
})
console.log(numbers);

let numbers2 = [5,8,2,7,1]
numbers2.sort((a,b) => b-a)
console.log(numbers2)
 */


function sum(...args){
    let sum = 0;
    for(const a of args){
        sum += a
    }
    return sum
}

console.log(sum(1,2,3,4,5))