import React from 'react'
import './Navbar.css'
import { Link } from 'react-router-dom'

const Navbar = ({ toggleSidebar }) => {
  return (
    <div id='navbar'>
        <span id='menu' onClick={toggleSidebar}>☰</span>
        <h1 id='title'>Enterprise Resource Planning System</h1>
        <Link to="/login" id='login-btn'>Log in</Link>
    </div>
  )
}

export default Navbar