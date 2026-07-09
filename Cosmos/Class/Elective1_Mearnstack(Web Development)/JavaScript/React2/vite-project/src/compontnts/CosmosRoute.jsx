import React from 'react'
import { Route, Routes } from 'react-router-dom'
import ReadAllProduct from './product/ReadAllProduct'
import CreateProduct from './product/CreateProduct'
import ReadSpecificProduct from './product/ReadSpecificProduct'
import UpdateProduct from './product/UpdateProduct'
import ReadAllUser from './user/ReadAllUser'
import CreateUser from './user/CreateUser'
import ReadSpecificUSer from './user/ReadSpecificUSer'
import UpdateUser from './user/UpdateUser'
import ReadAllSchool from './school/ReadAllSchool'
import CreateSchool  from './school/CreateSchool'
import ReadSpecificSchool from './school/ReadSpecificSchool'
import UpdateSchool from './school/UpdateSchool'

const CosmosRoute = () => {
  return (
    <div>
        <Routes>
            <Route path = "/product" element = {<ReadAllProduct></ReadAllProduct>}></Route>
             <Route path = "/product/create" element = {<CreateProduct></CreateProduct>}></Route>
             <Route path = "/product/:id" element = {<ReadSpecificProduct></ReadSpecificProduct>}></Route>
             <Route path = "/product/update/:id" element = {<UpdateProduct></UpdateProduct>}></Route>
             </Routes>
        
           <Routes>
            <Route path = "/user" element = {<ReadAllUser></ReadAllUser>}></Route>
             <Route path = "/user/create" element = {<CreateUser></CreateUser>}></Route>
             <Route path = "/user/:id" element = {<ReadSpecificUSer></ReadSpecificUSer>}></Route>
             <Route path = "/user/update/:id" element = {<UpdateUser></UpdateUser>}></Route>
             </Routes>
                  <Routes>
            <Route path = "/school" element = {<ReadAllSchool></ReadAllSchool>}></Route>
             <Route path = "/school/create" element = {<CreateSchool></CreateSchool>}></Route>
             <Route path = "/school/:id" element = {<ReadSpecificSchool></ReadSpecificSchool>}></Route>
             <Route path = "/school/update/:id" element = {<UpdateSchool></UpdateSchool>}></Route>
             </Routes>
    </div>
  )
}

export default CosmosRoute