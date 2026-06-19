/* // Arrow Function
let fun1 = () => {

    console.log("this is inside function")

fun1()
console.log(1)
fun1()
console.log(2)

fun1 This is not right way to define fucntion  */


/* let info = (name,surname,wada)=>{
    console.log(name,surname,wada)
}
info(Oshan , Bajracharya , 14)
info(Bibek , Ghimire , 9) */



/* undefine value
let info1 = (name,surname,weignt)=>{
    console.log(name,surname,weignt)
}
info1("Oshan")

let info1 = (name="xyz",surname="abc",weignt=62)=>{
    console.log(name,surname,weignt)
}
info1("Oshan","Bajracharya") */



/* let info1 = ()=>{
    console.log("A")
    return "B";
    console.log("C")
}//B , C doest print

let info1 = ()=>{
    console.log("A")
    return "B";
    console.log("C")
}
let i = info1()

console.log(i)
//c cant print due to return */


/* Function Without Return
fun()
Function with return
let i = fun() */



/* // make a function name  can vote pass 1 input if
//  the input is > = 18 return can vote else return cant vote 

let canVote = (age) =>{

if (age >=18)
    return "you can vote"
else 
    return "cant vote"
}

let voteAge = canVote(18)
console.log(voteAge)
 */



/* make a function name prepo it takes 1 input if input is male return he else she */
let perPo = (gender) =>{
if (gender ==="male")
    return "he"
else if (gender ==="female") 
    return "she"
else
    return "they"
}

let genderShow = perPo("male")
console.log(genderShow)