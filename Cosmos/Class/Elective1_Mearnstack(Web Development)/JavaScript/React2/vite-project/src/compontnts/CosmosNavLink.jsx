import React from 'react'
import { NavLink } from 'react-router-dom';
import './CosmosNavLink.css'; // Add this line to link the CSS

function CosmosNavLink() {
    return (
        <div className="nav-container"> {/* Added a class for targeting */}
            <NavLink to="/product">Product</NavLink>
            <NavLink to="/product/create">Create Product</NavLink>
            <NavLink to="/user">user</NavLink>
            <NavLink to="/user/create">create User</NavLink>
            <NavLink to="/school">School</NavLink>
            <NavLink to="/school/create">Create School</NavLink>
        </div>
    );
}

export default CosmosNavLink;