import { model, Schema } from "mongoose";

let schoolSchema = Schema({
    name : {
           type: String,
        required: [true, "name is required"]
    },
     addrress : {
           type: String,
        required: [true, "name is required"]
    },
     phone : {
           type: Number,
        required: [true, "name is required"]
    },
     email : {
           type: String,
        required: [true, "name is required"]
    },
     noOfRoom : {
           type: Number,
        required: [true, "name is required"]
    }
})
let School = model("school",schoolSchema)

export default School;