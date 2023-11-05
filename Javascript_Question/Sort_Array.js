const num = [5, 7, 1, 3, 9, 2, 4];

function sort_arr(arr){
    arr.sort((a,b) => b-a);
    return arr;
}

console.log(sort_arr(num));