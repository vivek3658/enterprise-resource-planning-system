
-- Insert Brands
INSERT INTO brands (id, name, created_at, updated_at) VALUES (1, 'Apple', NOW(), NOW());
INSERT INTO brands (id, name, created_at, updated_at) VALUES (2, 'Samsung', NOW(), NOW());

-- Insert Categories
INSERT INTO categories (id, name, created_at, updated_at) VALUES (1, 'Electronics', NOW(), NOW());
INSERT INTO categories (id, name, created_at, updated_at) VALUES (2, 'Laptops', NOW(), NOW());

-- Insert Products
INSERT INTO products (id, name, description, price, stock, brand_id, category_id, created_at, updated_at) VALUES (1, 'iPhone 15', 'Latest iPhone model', 999.99, 100, 1, 1, NOW(), NOW());
INSERT INTO products (id, name, description, price, stock, brand_id, category_id, created_at, updated_at) VALUES (2, 'MacBook Pro', 'Powerful laptop for professionals', 2499.99, 50, 1, 2, NOW(), NOW());
INSERT INTO products (id, name, description, price, stock, brand_id, category_id, created_at, updated_at) VALUES (3, 'Galaxy S24', 'Latest Samsung flagship phone', 899.99, 120, 2, 1, NOW(), NOW());
INSERT INTO products (id, name, description, price, stock, brand_id, category_id, created_at, updated_at) VALUES (4, 'Galaxy Book 4', 'Samsung akg tuned laptop', 1499.99, 75, 2, 2, NOW(), NOW());
INSERT INTO products (id, name, description, price, stock, brand_id, category_id, created_at, updated_at) VALUES (5, 'Apple Vision Pro', 'Apple VR headset', 3499.99, 25, 1, 1, NOW(), NOW());
