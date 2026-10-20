// import axios from "axios";
// import React, { useEffect, useState } from "react";
// import { useParams } from "react-router-dom";

// const ReadSpecificProduct = () => {
//   let params = useParams();
//   let [data, setData] = useState({});

//   let getData = async () => {
//     try {
//       let result = await axios({
//         url: `http://localhost:8000/product/${params.id}`,
//         method: "get",
//       });

//       setData(result.data.result);
//     } catch (error) {}
//   };
//   useEffect(() => {
//     getData();
//   }, []);
//   return (
//     <div>
//       <p>name is {data.name}</p>
//       <p>price is {data.price}</p>
//       <p>quantity is {data.quantity}</p>
//       <p>description is {data.description}</p>
//     </div>
//   );
// };

// export default ReadSpecificProduct;

// /* 
// localhost:8000/product/1234234
// method:get

// */


import React from 'react'

const ReadSpecificSchool = () => {
  return (
    <div>ReadSpecificSchool</div>
  )
}

export default ReadSpecificSchool