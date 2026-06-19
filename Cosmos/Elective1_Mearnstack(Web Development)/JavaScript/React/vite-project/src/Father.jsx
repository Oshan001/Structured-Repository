import React from 'react'
const Father = ({name , surname , age}) => {
  return (
    <div>
      <h1>My father info</h1>
     <p>name is {name} </p>
     <p>surname is {surname}</p>
     <p>age is {age}</p>
    </div>
  )
}

export default Father