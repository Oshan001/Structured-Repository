// import axios from "axios";
// import React, { useEffect, useState } from "react";
// import { useNavigate } from "react-router-dom";
// import { toast } from "react-toastify";

// const ReadAllProduct = () => {
//   let navigate = useNavigate();
//   let [data, setData] = useState([]);

//   //hit api on page load
//   //api gives data
//   // show data

//   let getData = async () => {
//     try {
//       let result = await axios({
//         url: "http://localhost:8000/product",
//         method: "get",
//       });
//       setData(result.data.result);
//     } catch (error) {}
//   };

//   useEffect(() => {
//     getData(); // it takes bakeend data and  show the data in fronted
//   }, []);

//   console.log(data);


//   return (
//     <div>
//       {data.map((item, i) => {
//         return (
//           <div key={i}>
//             <p> name is {item.name}</p>
//             <p>price is {item.price}</p>
//             <p>quantity is {item.quantity}</p>
//             <p>description is {item.description}</p>
//             <button
//               onClick={() => {
//                 navigate(`/product/${item._id}`);
//               }}
//             >
//               View
//             </button>
//             <button>Update</button>
//             <button
//               onClick={async () => {
//                 try {
//                   let result = await axios({
//                     url: `http://localhost:8000/product/${item._id}`,
//                     method: "delete",
//                   });
//                   getData();
//                   toast.success("product delete successfully.");
//                 } catch (error) {
//                   toast.error("unable to delte product");
//                 }
//               }}
//             >
//               Delete
//             </button>
//           </div>
//         );
//       })}
//     </div>
//   );
// };

// export default ReadAllProduct;







import React, { useEffect, useState } from 'react'

const ReadAllProduct = () => {
const [data, setData] = useState([]);
let getData = async ()=>{
try {
  let result = await axios({
    url : "http//localhost/8000/product",
     method : "get",
})
 setData(result.data.result)
} catch (error) {}

};
 console.log(data)

useEffect(()=>{
getData();
},[])

  return (
    <div>
      {
        data.map((item,i)=>{
          {
            <div key = {i}>
              <p>name is {item.name}</p>
              <p>price is {item.price}</p>
              <p>quantity is {item.quantity}</p>
              <p>description is {item.description}</p>
              </div>
          }
        })
      }
    </div>
  )
}

export default ReadAllProduct