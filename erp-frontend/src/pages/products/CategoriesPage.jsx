import React, { useState, useEffect } from 'react';
import axios from 'axios';

const CategoriesPage = () => {
  const [categories, setCategories] = useState([]);
  const [page, setPage] = useState(0);
  const [totalPages, setTotalPages] = useState(0);
  const [newCategoryName, setNewCategoryName] = useState('');
  const [editingCategory, setEditingCategory] = useState(null);
  const [error, setError] = useState(null);

  const fetchCategories = async (page) => {
    try {
      const response = await axios.get(`/api/product/categories?page=${page}&size=10`);
      setCategories(response.data.content);
      setTotalPages(response.data.totalPages);
    } catch (err) {
      setError('Failed to fetch categories.');
      console.error(err);
    }
  };

  useEffect(() => {
    fetchCategories(page);
  }, [page]);

  const handleAddCategory = async (e) => {
    e.preventDefault();
    try {
      await axios.post('/api/product/categories', { name: newCategoryName });
      setNewCategoryName('');
      fetchCategories(page);
    } catch (err) {
      setError('Failed to add category.');
      console.error(err);
    }
  };

  const handleDeleteCategory = async (id) => {
    try {
      await axios.delete(`/api/product/categories/${id}`);
      fetchCategories(page);
    } catch (err) {
      setError('Failed to delete category.');
      console.error(err);
    }
  };

  const handleUpdateCategory = async (id, name) => {
    try {
      await axios.put(`/api/product/categories/${id}`, { name });
      setEditingCategory(null);
      fetchCategories(page);
    } catch (err) {
      setError('Failed to update category.');
      console.error(err);
    }
  };

  const handleEdit = (category) => {
    setEditingCategory({ ...category });
  };

  return (
    <div>
      <h2>Categories</h2>
      {error && <p className="error-message">{error}</p>}
      <form onSubmit={handleAddCategory}>
        <input
          type="text"
          value={newCategoryName}
          onChange={(e) => setNewCategoryName(e.target.value)}
          placeholder="New category name"
          required
        />
        <button type="submit">Add Category</button>
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
          {categories.map((category) => (
            <tr key={category.id}>
              <td>{category.id}</td>
              <td>
                {editingCategory && editingCategory.id === category.id ? (
                  <input
                    type="text"
                    value={editingCategory.name}
                    onChange={(e) => setEditingCategory({ ...editingCategory, name: e.target.value })}
                  />
                ) : (
                  category.name
                )}
              </td>
              <td>
                {editingCategory && editingCategory.id === category.id ? (
                  <>
                    <button onClick={() => handleUpdateCategory(editingCategory.id, editingCategory.name)}>Save</button>
                    <button onClick={() => setEditingCategory(null)}>Cancel</button>
                  </>
                ) : (
                  <>
                    <button onClick={() => handleEdit(category)}>Edit</button>
                    <button onClick={() => handleDeleteCategory(category.id)}>Delete</button>
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

export default CategoriesPage;
