import React, { useState, useEffect } from 'react';
import axios from 'axios';
import './ProductsPage.css';

const ProductsPage = () => {
  const [products, setProducts] = useState([]);
  const [page, setPage] = useState(0);
  const [totalPages, setTotalPages] = useState(0);
  const [error, setError] = useState(null);

  // Form state
  const [editingProduct, setEditingProduct] = useState(null);
  const [name, setName] = useState('');
  const [description, setDescription] = useState('');
  const [price, setPrice] = useState('');
  const [brandId, setBrandId] = useState('');
  const [categoryId, setCategoryId] = useState('');

  const [brands, setBrands] = useState([]);
  const [categories, setCategories] = useState([]);

  const fetchProducts = async (page) => {
    try {
      const response = await axios.get(`/api/product/products?page=${page}&size=10`);
      setProducts(response.data.content);
      setTotalPages(response.data.totalPages);
    } catch (err) {
      setError('Failed to fetch products.');
      console.error(err);
    }
  };

  const fetchBrandsAndCategories = async () => {
    try {
      const brandsResponse = await axios.get('/api/product/brands?size=1000');
      setBrands(brandsResponse.data.content);
      const categoriesResponse = await axios.get('/api/product/categories?size=1000');
      setCategories(categoriesResponse.data.content);
    } catch (err) {
      console.error('Failed to fetch brands or categories', err);
    }
  };

  useEffect(() => {
    fetchBrandsAndCategories();
  }, []);

  useEffect(() => {
    fetchProducts(page);
  }, [page]);

  const resetForm = () => {
    setEditingProduct(null);
    setName('');
    setDescription('');
    setPrice('');
    setBrandId('');
    setCategoryId('');
  };

  const handleFormSubmit = async (e) => {
    e.preventDefault();
    const productData = { name, description, price, brandId: Number(brandId), categoryId: Number(categoryId) };

    try {
      if (editingProduct) {
        await axios.put(`/api/product/products/${editingProduct.id}`, productData);
      } else {
        await axios.post('/api/product/products', productData);
      }
      resetForm();
      fetchProducts(page);
    } catch (err) {
      setError(`Failed to ${editingProduct ? 'update' : 'add'} product.`);
      console.error(err);
    }
  };

  const handleEdit = (product) => {
    setEditingProduct(product);
    setName(product.name);
    setDescription(product.description);
    setPrice(product.price);
    const brand = brands.find(b => b.name === product.brand);
    if(brand) setBrandId(brand.id);
    const category = categories.find(c => c.name === product.category);
    if(category) setCategoryId(category.id);
  };

  const handleDelete = async (id) => {
    try {
      await axios.delete(`/api/product/products/${id}`);
      fetchProducts(page);
    } catch (err) {
      setError('Failed to delete product.');
      console.error(err);
    }
  };

  if (error) {
    return <div className="error-message">{error}</div>;
  }

  return (
    <div className="products-container">
      <h2>{editingProduct ? 'Edit Product' : 'Add Product'}</h2>
      <form onSubmit={handleFormSubmit}>
        <input type="text" value={name} onChange={e => setName(e.target.value)} placeholder="Name" required />
        <input type="text" value={description} onChange={e => setDescription(e.target.value)} placeholder="Description" />
        <input type="number" value={price} onChange={e => setPrice(e.target.value)} placeholder="Price" required />
        <select value={brandId} onChange={e => setBrandId(e.target.value)} required>
          <option value="">Select Brand</option>
          {brands.map(brand => <option key={brand.id} value={brand.id}>{brand.name}</option>)}
        </select>
        <select value={categoryId} onChange={e => setCategoryId(e.target.value)} required>
          <option value="">Select Category</option>
          {categories.map(category => <option key={category.id} value={category.id}>{category.name}</option>)}
        </select>
        <button type="submit">{editingProduct ? 'Update Product' : 'Add Product'}</button>
        {editingProduct && <button type="button" onClick={resetForm}>Cancel</button>}
      </form>

      <h1>Products</h1>
      <div className="table-wrapper">
        <table className="products-table">
          <thead>
            <tr>
              <th>ID</th>
              <th>Name</th>
              <th>Description</th>
              <th>Price</th>
              <th>Category</th>
              <th>Brand</th>
              <th>Actions</th>
            </tr>
          </thead>
          <tbody>
            {products && products.map((product) => (
              <tr key={product.id}>
                <td>{product.id}</td>
                <td>{product.name}</td>
                <td>{product.description}</td>
                <td>{product.price}</td>
                <td>{product.category}</td>
                <td>{product.brand}</td>
                <td>
                  <button onClick={() => handleEdit(product)}>Edit</button>
                  <button onClick={() => handleDelete(product.id)}>Delete</button>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
      <div className="pagination">
        <button onClick={() => setPage(p => Math.max(0, p - 1))} disabled={page === 0}>
          Previous
        </button>
        <span>Page {page + 1} of {totalPages}</span>
        <button onClick={() => setPage(p => Math.min(totalPages - 1, p + 1))} disabled={page === totalPages - 1}>
          Next
        </button>
      </div>
    </div>
  );
};

export default ProductsPage;
