/* to make API :->
S1 :make Router
S2 :make controller
*/
import express, { json } from "express"
import mongoose, { model } from "mongoose"
import productRoutes from "./src/routes/productRouts.js"
import userRoutes from "./src/routes/userRouts.js"
// import schoolSchema from "./src/routes/SchoolRoutes.js"
import schoolRoutes from "./src/routes/SchoolRoutes.js"
let app = express()
app.listen(8000,()=>{
console.log("application is listening at port 8000")
mongoose.connect("mongodb://localhost:27017/cosmos")
})
app.use(json())   
app.use('/product',productRoutes)
app.use('/user',userRoutes)
app.use('/school',schoolRoutes)

