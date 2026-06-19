import { Router } from "express";
import School from "../schema/SchoolSchema.js";

const schoolSchema = Router()
schoolSchema
.route("/")
.post(async(req , res , next) => {
try {
    let result = await School.create(req.body)
    res.json({
    Success : true,
    message : "School created sucesfully",
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
    let result = await School.find()
    res.json({
    Success : true,
    message : "School created sucesfully",
    result : result ,
})
} catch (error) {
    res.json({
      success : false,
      message : error.message,
    })
}
})

schoolSchema
.route("/:id")
.get(async(req , res , next) => {
   try {
    let result = await School.findById(req.params.id)
     res.json({
    message : "School created sucesfully",
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
    let result = await School.findByIdAndUpdate(req.params.id,req.body)
     res.json({
    message : "School update sucesfully",
    result : result
   })
   } catch (error) {
         res.json({
    success : false,
    message : error.message,
   })
   }
})
.delete(async(req , res , next) => {
   try {
    let result = await School.findByIdAndDelete(req.params.id)
     res.json({
    message : "School delete sucesfully",
    result : result
   })
   } catch (error) {
         res.json({
    success : false,
    message : error.message,
   })
   }
})

export default schoolSchema