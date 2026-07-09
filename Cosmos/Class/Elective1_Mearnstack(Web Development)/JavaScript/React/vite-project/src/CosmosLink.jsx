import React from 'react'
import { NavLink, useNavigate } from 'react-router-dom'

const CosmosLink = () => {
    let navigate = useNavigate()
  return (
    <div>
    <NavLink to = "/about" className={"navlink"}>About</NavLink>
     <NavLink to = "/jobs" className={"navlink"}>Jobs</NavLink>
    <NavLink to = "/product" className={"navlink"}>product</NavLink>
    <button onClick = {()=>{
     navigate("login") 
     console.log("button clicked")
    }}>Login</button>
    </div>
  )
}

export default CosmosLink

//based on url , attach page (component) 
