import { Router } from "express";
import Product from "../schema/productSchema.js";

const productRoutes = Router()

productRoutes
.route("/")
.post(async(req , res , next) => {
/* Send data form postman get data sent by  
postman store data inProduct table  */
try {
    let result = await Product.create(req.body)
    res.json({
    Success : true,
    message : "Product created sucesfully",
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
    let result = await Product.find()
    res.json({
    Success : true,
    message : "Product created sucesfully",
    result : result ,
})
} catch (error) {
    res.json({
      success : false,
      message : error.message,
    })
}
})

productRoutes
.route("/:id")
.get(async(req , res , next) => {
   try {
    let result = await Product.findById(req.params.id)
     res.json({
    message : "Product created sucesfully",
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
    let result = await Product.findByIdAndUpdate(req.params.id,req.body)
     res.json({
    message : "Product update sucesfully",
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
    let result = await Product.findByIdAndDelete(req.params.id)
     res.json({
    message : "Product delete sucesfully",
    result : result
   })
   } catch (error) {
         res.json({
    success : false,
    message : error.message,
   })
   }
})
export default productRoutes

/* 
localhost : 8000/product , post
localhost : 8000/product , get

localhost : 8000/:id ,  get
localhost : 8000/:id , patch
localhost : 8000/:id , delete
*/

/* 
Product.create(req.body)
product.find()
product.findById(req.params.id)
product.findByIdAndUpdate(req.params.id,req.body)
product.findByIdAndDelete(req.params.id)
*/