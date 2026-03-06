import React, { useState, useEffect } from 'react';
import axios from 'axios';

const BrandsPage = () => {
  const [brands, setBrands] = useState([]);
  const [page, setPage] = useState(0);
  const [totalPages, setTotalPages] = useState(0);
  const [newBrandName, setNewBrandName] = useState('');
  const [editingBrand, setEditingBrand] = useState(null);
  const [error, setError] = useState(null);

  const fetchBrands = async (page) => {
    try {
      const response = await axios.get(`/api/product/brands?page=${page}&size=10`);
      setBrands(response.data.content);
      setTotalPages(response.data.totalPages);
    } catch (err) {
      setError('Failed to fetch brands.');
      console.error(err);
    }
  };

  useEffect(() => {
    fetchBrands(page);
  }, [page]);

  const handleAddBrand = async (e) => {
    e.preventDefault();
    try {
      await axios.post('/api/product/brands', { name: newBrandName });
      setNewBrandName('');
      fetchBrands(page);
    } catch (err) {
      setError('Failed to add brand.');
      console.error(err);
    }
  };

  const handleDeleteBrand = async (id) => {
    try {
      await axios.delete(`/api/product/brands/${id}`);
      fetchBrands(page);
    } catch (err) {
      setError('Failed to delete brand.');
      console.error(err);
    }
  };

  const handleUpdateBrand = async (id, name) => {
    try {
      await axios.put(`/api/product/brands/${id}`, { name });
      setEditingBrand(null);
      fetchBrands(page);
    } catch (err) {
      setError('Failed to update brand.');
      console.error(err);
    }
  };

  const handleEdit = (brand) => {
    setEditingBrand({ ...brand });
  };

  return (
    <div>
      <h2>Brands</h2>
      {error && <p className="error-message">{error}</p>}
      <form onSubmit={handleAddBrand}>
        <input
          type="text"
          value={newBrandName}
          onChange={(e) => setNewBrandName(e.target.value)}
          placeholder="New brand name"
          required
        />
        <button type="submit">Add Brand</button>
      </form>
      <table>
        <thead>
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Actions</th>
          </tr>
        </thead>
        <tbody>
          {brands.map((brand) => (
            <tr key={brand.id}>
              <td>{brand.id}</td>
              <td>
                {editingBrand && editingBrand.id === brand.id ? (
                  <input
                    type="text"
                    value={editingBrand.name}
                    onChange={(e) => setEditingBrand({ ...editingBrand, name: e.target.value })}
                  />
                ) : (
                  brand.name
                )}
              </td>
              <td>
                {editingBrand && editingBrand.id === brand.id ? (
                  <>
                    <button onClick={() => handleUpdateBrand(editingBrand.id, editingBrand.name)}>Save</button>
                    <button onClick={() => setEditingBrand(null)}>Cancel</button>
                  </>
                ) : (
                  <>
                    <button onClick={() => handleEdit(brand)}>Edit</button>
                    <button onClick={() => handleDeleteBrand(brand.id)}>Delete</button>
                  </>
                )}
              </td>
            </tr>
          ))}
        </tbody>
      </table>
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

export default BrandsPage;
