-- Create a simple table
CREATE TABLE IF NOT EXISTS test_table (
    id INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

-- Create a read-only user and grant permissions
CREATE USER IF NOT EXISTS 'readonly_user'@'%' IDENTIFIED BY 'readonly_password';
GRANT SELECT ON db.* TO 'readonly_user'@'%';
FLUSH PRIVILEGES;
