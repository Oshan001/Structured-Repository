import React from 'react'

const Information = ({name ,surname ,ward}) => {
  return (
    <div>
        <h1> MY INFO :</h1>
        <p>Name is {name}</p>
        <p>Surname is {surname}</p>
        <p>Ward is {ward}</p>
        </div>
  )
}

export default Information