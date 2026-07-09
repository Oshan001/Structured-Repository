import {Schema , model} from "mongoose"
let porductSchema = Schema({
    name : {
        type: String,
        required: [true, "name is required"]
    },
    price : {
        type: Number, 
        required: [true, "price is required"]
    },
    Quantity : {
        type: Number,
        required: [true, "quantity is required"]
    },
    description : {
        type: String,
    },
})
let Product = model("Product",porductSchema) 
export default  Product