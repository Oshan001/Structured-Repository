import React, { useState } from 'react'

const LearnUseState = () => {
    let [name,setName] = useState("Oshan")
    let [count ,setCount] = useState(1)
  return (

    <div>
        <p>My name is {name}</p>

        <button onClick={()=>{
            console.log("button clicked")
            }}>
                send
                </button>
                
        <button onClick={()=>{
            console.log("change name")
            setName("Ram")
            }}>
                change name
                </button>
        
        <p>Counting : {count}</p>
        <button onClick={()=>{
            setCount(count  + 1)
        }} >+</button>
               <button onClick={()=>{
            setCount(count  - 1)
        }} >-</button>

    </div>
  )
}

export default LearnUseState