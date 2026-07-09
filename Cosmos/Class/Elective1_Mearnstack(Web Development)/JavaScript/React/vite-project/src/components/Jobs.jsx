import React from 'react'
import { useParams } from 'react-router-dom';

const Jobs = () => {
  let params =  useParams();
      console.log(params);

  return (
    <div>
this is job page
      
    </div>
  )
}

export default Jobs