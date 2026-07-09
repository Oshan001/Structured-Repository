import React from 'react'
import { Route, Routes } from 'react-router-dom'
import Product from './components/Product'
import Jobs from './components/Jobs'
import About from './components/About'
import Login from './components/Login'

const CosmosRoutes = () => {
  return (
    <div>
    <Routes>
               <Route path = "/Product" element={<Product></Product>}></Route>
            <Route path = "/jobs/:id1/name/:id2" element ={<Jobs></Jobs>}></Route>
            <Route path = "/About" element ={<About></About>}></Route>
            <Route path = "/Login" element ={<Login></Login>}></Route>
    </Routes>
        </div>
  )
}

export default CosmosRoutes