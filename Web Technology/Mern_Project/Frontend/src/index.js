import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import { BrowserRouter,Routes, Route } from'react-router-dom';
import Layout from './Layout';
import Home from './Home';
import Employees from './Employees';
import DetailEmployee from './DetailEmployee';
import EditEmployee from './EditEmployee';
import AddEmployee from './AddEmployee';
import SearchEmployee from './SearchEmployee';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <BrowserRouter>
    
        <Routes>
        <Route path="/" element={<Layout/>} >
        <Route path="/" element={<Home/>} />
        <Route path="/employees" element={<Employees/>} />
        <Route path="/employees/:id" element={<DetailEmployee/>} />
        <Route path='/editEmployee/:id' element={<EditEmployee/>} />
        <Route path='/addEmployee' element={<AddEmployee/>} />
        <Route path='/searchEmployee' element={<SearchEmployee/>} />
            </Route>
        </Routes>
   
  </BrowserRouter>
);
