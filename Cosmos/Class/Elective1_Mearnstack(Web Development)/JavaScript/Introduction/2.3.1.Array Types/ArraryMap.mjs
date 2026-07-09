/* 
// Map Loop
// condition: input array output array, no of input key = no of output key

let ar1 = [10,20,30];

//syntax :
let ar = ar1.map((item,i) => {

    return item * i;
})

console.log(ar)
 */


/* 
// [10,20,30]  -> [20,40,60]

let ar2 = [10,20,30];
let ar = ar2.map((item,i) => {

    return item * 2;
})

console.log(ar)
 */


// if num > 18 then *2   else *0 ; [20,30,40,10,2] -->   [ 40, 60, 80, 0, 0 ]
let ar2 = [20,30,40,10,2]
let ar = ar2.map((item,i) => {

  if (item >= 18 ) 
   return item *2 
  else
    return 0;
  
})

console.log(ar)