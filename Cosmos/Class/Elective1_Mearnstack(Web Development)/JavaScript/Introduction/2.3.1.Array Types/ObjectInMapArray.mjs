
//Object In Map Array
let user = [
    {name : "oshan" , age : 21},
    {name:"roshan" , age : 32},
    {name:"ram" , age : 33},
]

let names = user.map((items,i)=>{
    return items.name;
})
console.log(names)