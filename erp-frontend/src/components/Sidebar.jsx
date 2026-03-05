import React from 'react'
import './Sidebar.css'
import { Link } from 'react-router-dom'

const Sidebar = () => {
  return (
    <div id='sidebar'>
        Sidebar
        <li><Link to="/">Dashboard</Link></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
    </div>
  )
}

export default Sidebar