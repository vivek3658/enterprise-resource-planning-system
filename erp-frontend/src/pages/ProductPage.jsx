import React, { useState } from 'react';
import ProductsPage from './products/ProductsPage';
import BrandsPage from './products/BrandsPage';
import CategoriesPage from './products/CategoriesPage';
import './ProductPage.css';

const ProductPage = () => {
  const [activeTab, setActiveTab] = useState('products');

  const renderPage = () => {
    switch (activeTab) {
      case 'products':
        return <ProductsPage />;
      case 'brands':
        return <BrandsPage />;
      case 'categories':
        return <CategoriesPage />;
      default:
        return <ProductsPage />;
    }
  };

  return (
    <div className="product-page">
      <div className="tab-navigation">
        <button
          className={activeTab === 'products' ? 'active' : ''}
          onClick={() => setActiveTab('products')}
        >
          Products
        </button>
        <button
          className={activeTab === 'brands' ? 'active' : ''}
          onClick={() => setActiveTab('brands')}
        >
          Brands
        </button>
        <button
          className={activeTab === 'categories' ? 'active' : ''}
          onClick={() => setActiveTab('categories')}
        >
          Categories
        </button>
      </div>
      <div className="page-content">
        {renderPage()}
      </div>
    </div>
  );
};

export default ProductPage;
