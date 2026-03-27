import React from 'react'
import './Sidebar.css'
import { Link } from 'react-router-dom'

const Sidebar = ({ isOpen, closeSidebar }) => {
  return (
    <div id='sidebar' className={isOpen ? 'open' : ''}>
        <Link to="/" onClick={closeSidebar}>Home</Link>
        <Link to="/dashboard" onClick={closeSidebar}>Dashboard</Link>
        <Link to="/product" onClick={closeSidebar}>Product</Link>
        <Link to="/purchase" onClick={closeSidebar}>Purchase</Link>
        <Link to="/sales" onClick={closeSidebar}>Sales</Link>
        <Link to="/inventory" onClick={closeSidebar}>Inventory</Link>
        <Link to="/operations" onClick={closeSidebar}>Operations</Link>
        <Link to="/hr" onClick={closeSidebar}>HR</Link>
        <Link to="/suppliers" onClick={closeSidebar}>Suppliers</Link>
        <Link to="/company" onClick={closeSidebar}>Company</Link>
        
    </div>
  )
}

export default Sidebar