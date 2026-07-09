// object is dictationary  in python
let info = {
    name : "oshan",
    weight : 65,
    isSingle : true

}
console.log(info)
console.log(info.name) 

//(info.weight = 62)  property
info.weight = 62    //replace value
console.log(info)

info.address = "ktm"  // add new key
console.log(info)

delete info.name;   //delete key
console.log(info)
    
