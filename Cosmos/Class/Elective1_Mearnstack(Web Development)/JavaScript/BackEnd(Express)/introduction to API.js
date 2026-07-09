
// /* 
// Database operation (CRUD)
// CREATE ->  post
// READ   ->  get
// UPDATE ->  patch
// DELETE ->  delete
// */

// /* make express application
// attach port to it
//  */
// import express from "express"
// let app = express()
// app.listen(8000,()=>{
//     console.log("appication is listening at port at 8000")
// })
// /* 
// localhost : 8000 , post   => "a"
// localhost : 8000 , get    => "b"
// localhost : 8000 , patch  => "c"
// localhost : 8000 , delete => "d"

// */

// app.post("/",(req,res,next)=>{     // ' / '  => localhost : 8000 
//     console.log("a")
// })  

// app.get("/",(req,res,next)=>{     
//     console.log("b")
// })  

// app.patch("/",(req,res,next)=>{
//     console.log("c")
// })

// app.delete("/", (req,res,next)=>{
//     console.log("d")
// })
// app.get("/product",(req,res,next)=>{     
//     console.log("Read the all product")
// })  

// app.post("/product/car",(req,res,next)=>{     
//     console.log("I am car")
// })  



