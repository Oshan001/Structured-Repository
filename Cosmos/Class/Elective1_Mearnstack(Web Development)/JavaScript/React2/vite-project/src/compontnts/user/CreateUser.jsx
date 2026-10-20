import axios from "axios";
import React, { useState } from "react";
import { toast } from "react-toastify";

const CreateUser = () => {
  let [name,setName] = useState("oshan");
  let [address,setAddress] = useState("");
  let [email,setEmail] = useState("");
  let [password,setPassword] = useState("");
  let [phone,setPhone] = useState("");
  const handleSubmit = async(e) => {
    e.preventDefault();
   let data = {
    name : name,
    address : address,
    email : email,
    passowrd : password,
    phone : phone,
   }
try{
  let result = await axios({
            url:"http://localhost:8000/user",
          method:"post",
          data:data
  });
  toast.success("user Connected")
  setName("");
  setEmail("");
  setPassword("");
  setPhone("");
  setAddress("");
}catch(error){
    toast.error(error.response.data.message)
}

  };

  return (
    <div>
      <form onSubmit={handleSubmit}>
        <h2>Create User</h2>

        <div>
          <label htmlFor="Name">Name</label>
          <input id = "name"  value = {name} type="text" placeholder="Enter user name" onChange={(e)=>{
           
           setName(e.target.value);
          }} />
        </div>

        <div>
          <label htmlFor="address" >Address</label>
           
          <input id = "address" value = {address} type="text" placeholder="Enter address" onChange={(e)=>{
         setAddress(e.target.value);
          }} />
        </div>

        <div>
          <label htmlFor="Email">Email</label>
          <input id = "Email"  value = {email} type="email" placeholder="Enter Email" onChange={(e)=>{
            setEmail(e.target.value);
          }} />
        </div>

        <div>
          <label htmlFor="Password" >Password</label>
         
          <input id="Password"  value = {password} type = "password" placeholder="Enter Password" onChange={(e)=>{
            setPassword(e.target.value);
          }}/>
        </div>
          <div>
          <label htmlFor="Phone" >Phone</label>
          <input id="Phone"  value = {phone} type = "number" placeholder="Enter phone" onChange={(e)=>{
            setPhone(e.target.value);
          }}/>
        </div>

        <button type="submit">Create User</button>
      </form>
    </div>
  );
};

export default CreateUser;