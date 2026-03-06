import React from 'react'
import './Sidebar.css'
import { Link } from 'react-router-dom'

const Sidebar = () => {
  return (
    <div id='sidebar'>
        <Link to="/">Home</Link>
        <Link to="/dashboard">Dashboard</Link>
        <Link to="/product">Product</Link>
        <Link to="/purchase">Purchase</Link>
        <Link to="/sales">Sales</Link>
        <Link to="/inventory">Inventory</Link>
        <Link to="/operations">Operations</Link>
        <Link to="/hr">HR</Link>
        <Link to="/suppliers">Suppliers</Link>
        <Link to="/company">Company</Link>
        
    </div>
  )
}

export default Sidebar