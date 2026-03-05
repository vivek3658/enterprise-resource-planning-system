import { useState } from 'react'
import './App.css'
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import HomeScreen from './pages/HomeScreen'
import Navbar from './components/Navbar'
import Sidebar from './components/Sidebar'

function App() {


  return (
    <BrowserRouter>
    <div id='root'>
      <Navbar />
        <div id='main'>
          <Sidebar />
          <Routes>
            <Route path='/' element={<HomeScreen />}/>
          </Routes>
        </div>
    </div>
    </BrowserRouter>
  )
}

export default App
