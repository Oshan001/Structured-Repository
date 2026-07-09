import React, { useState } from "react";

const CreateProduct = () => {
  let [name,setName] = useState("oshan");
  let [address,setAddress] = useState("");
  let [email,setEmail] = useState("");
  let [password,setPassword] = useState("");
  let [phone,setPhone] = useState("");
  const handleSubmit = (e) => {
    e.preventDefault();
   let data = {
    name : name,
    address : address,
    email : email,
    passowrd : password,
    phone : phone,
   }
   console.log(data);
  };

  return (
    <div>
      <form onSubmit={handleSubmit}>
        <h2>Create Product</h2>

        <div>
          <label htmlFor="Name">Name</label>
          <input id = "name"  value = {name} type="text" placeholder="Enter product name" onChange={(e)=>{
           
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

        <button type="submit">Create Product</button>
      </form>
    </div>
  );
};

export default CreateProduct;