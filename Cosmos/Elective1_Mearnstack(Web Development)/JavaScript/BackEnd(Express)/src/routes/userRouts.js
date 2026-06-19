import { Router } from "express";
import User from "../schema/userSchema.js";

let userRoutes = Router()
userRoutes
.route("/")
.post(async(req , res , next) => {
/* Send data form postman get data sent by  
postman store data inuser table  */
try {
    let result = await User.create(req.body)
    res.json({
    Success : true,
    message : "User created sucesfully",
    result : result 
})
} catch (error) {
    res.json({
      success : false,
      message : error.message,
    })
}
})
.get(async(req , res , next) => {
try {
    let result = await User.find()
    res.json({
    Success : true,
    message : "User created sucesfully",
    result : result ,
})
} catch (error) {
    res.json({
      success : false,
      message : error.message,
    })
}
})



userRoutes
.route("/:id")
.get(async(req , res , next) => {
   try {
    let result = await User.findById(req.params.id)
     res.json({
    message : "User created sucesfully",
    result : result
   })
   } catch (error) {
         res.json({
    success : false,
    message : error.message,
   })
   }
})




.patch(async(req , res , next) => {
   try {
    let result = await User.findByIdAndUpdate(req.params.id,req.body)
     res.json({
    message : "User update sucesfully",
    result : result
   })
   } catch (error) {
         res.json({
    success : false,
    message : error.message,
   })
   }
})
/* 
User.create(req.body)
User.find()

*/
.delete(async(req , res , next) => {
   try {
    let result = await User.findByIdAndDelete(req.params.id)
     res.json({
    message : "User delete sucesfully",
    result : result
   })
   } catch (error) {
         res.json({
    success : false,
    message : error.message,
   })
   }
})
export default userRoutes


/* 
User.create(req.body)
User.find()
User.findById(req.params.id)
User.findByIdAndUpdate(req.params.id,req.body)
User.findByIdAndDelete(req.params.id)
*/