import React, { useState } from 'react';
import axios from "axios";

const CreateProduct = () => {

  let [name, setName] = useState("intital_value");
  let [price, setPrice] = useState("");
  let [quantity, setQuantity] = useState("");
  let [description, setDescription] = useState("");

    const handleSubmit = async (e) => {
        e.preventDefault();

        let data ={
          name:name,
          price:price,
          quantity:quantity,
          description:description,
        };
        console.log(data);

        /* to send data from frontent to backend we need to package axios so npm i axios in cmd

        send data to backend
        url =>localhost:8000/product
        method => post
        data
        */

        try {
          let result = await axios({
          url:"http://localhost:8000/product",
          method:"post",
          data:data
        });
        } catch (error) {
          
        }
       
    };
  return (
    <div>
      {/* <h1>CreateProduct page</h1> */}
      <form onSubmit={handleSubmit}>
        <div>
          <div>
            <label htmlFor='name'>Name</label>
            <input text="text"
            id='name'
            value={name}
             onChange={(e)=>{
              setName(e.target.value);
            }}  />
          </div>
          <div>
            <label htmlFor="price">Price</label>
            <input type='number' id="price" onChange={(e)=>{
              setPrice(e.target.value);
            }
            } />
          </div>
          <div>
            <label htmlFor="quality">Quantity</label>
            <input type='number' id="quality" onChange={(e)=>{
              setQuantity(e.target.value);
            }} />
          </div>
          <div>
            <label htmlFor="description">Description</label>
            <textarea id="description" onChange={(e)=>{
              setDescription(e.target.value);
            }}/>
          </div>
        </div>
        <div>
            <button>Create</button>
        </div>
      </form>
    </div>
  )
}

export default CreateProduct;