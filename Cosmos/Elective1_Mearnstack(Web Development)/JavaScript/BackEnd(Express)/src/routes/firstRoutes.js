
/* 
S!:make routes 
S2:use that routes at index
*/
import { Router } from "express"
let firstRoute = Router()

firstRoute
.route('/')
.get((req,res,next)=>{
    console.log(req.body)
    console.log('a')
})
.post((req,res,next)=>{
    console.log('b')
})

firstRoute
.route('/job')
.get((req,res,next)=>{
    console.log('c')
})



//dynamic parames

export default firstRoute

firstRoute
.route('/:id1/a/:id2')
.get((req,res,next)=>{
    console.log("dynamic params")
    console.log(req.params)
})
/* 
localhost:8000 , get =>a
localhost:8000 , post =>a

localhost:8000/job , get => c
*/