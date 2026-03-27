import { useState } from 'react'
import './App.css'
import { BrowserRouter, Route, Routes, useLocation } from 'react-router-dom'
import HomePage from './pages/HomePage.jsx'
import Navbar from './components/Navbar.jsx'
import Sidebar from './components/Sidebar.jsx'
import DashboardPage from './pages/DashboardPage.jsx'
import InventoryPage from './pages/InventoryPage.jsx'
import ProductPage from './pages/ProductPage.jsx'
import PurchasePage from './pages/PurchasePage.jsx'
import SalesPage from './pages/SalesPage.jsx'
import SupplierPage from './pages/SupplierPage.jsx'
import OperationsPage from './pages/OperationsPage.jsx'
import HRPage from './pages/HRPage.jsx'
import CompanyPage from './pages/CompanyPage.jsx'
import NotFoundPage from './pages/NotFoundPage.jsx'
import ProductsPage from './pages/products/ProductsPage.jsx'
import LoginPage from './pages/LoginPage.jsx'

function AppContent() {
  const [isSidebarOpen, setIsSidebarOpen] = useState(false);
  const location = useLocation();

  const toggleSidebar = () => {
    setIsSidebarOpen(!isSidebarOpen);
  };

  const closeSidebar = () => {
    setIsSidebarOpen(false);
  };

  const isLoginPage = location.pathname === '/login';

  return (
    <div id='root'>
      {!isLoginPage && <Navbar toggleSidebar={toggleSidebar} />}
      {!isLoginPage && (
        <div id='main'>
          <Sidebar isOpen={isSidebarOpen} closeSidebar={closeSidebar} />
          {isSidebarOpen && <div className="sidebar-overlay" onClick={closeSidebar}></div>}
          <Routes>
            <Route path='/product/brands' element={<ProductsPage />} />
            <Route path='/product/categories' element={<ProductsPage />} />
            <Route path='/product/products' element={<ProductsPage />} />
            <Route path='/product/taxes' element={<ProductsPage />} />
            <Route path='/' element={<HomePage />}/>
            <Route path='/dashboard' element={<DashboardPage />} />
            <Route path='/inventory' element={<InventoryPage />} />
            <Route path='/product' element={<ProductPage />} />
            <Route path='/purchase' element={<PurchasePage />} />
            <Route path='/sales' element={<SalesPage />} />
            <Route path='/suppliers' element={<SupplierPage />} />
            <Route path='/operations' element={<OperationsPage />} />
            <Route path='/hr' element={<HRPage />} />
            <Route path='/company' element={<CompanyPage />} />
            <Route path='/*' element={<NotFoundPage />} />
          </Routes>
        </div>
      )}
      {isLoginPage && (
        <Routes>
          <Route path='/login' element={<LoginPage />} />
        </Routes>
      )}
    </div>
  )
}

function App() {
  return (
    <BrowserRouter>
      <AppContent />
    </BrowserRouter>
  )
}

export default App
