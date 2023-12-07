-- Question 1
USE northwind;

INSERT INTO suppliers
VALUES (30, 'Potato Factory', 'Potato', 'CEO', '123 Potato street', 'New York', 'North East', '12345', 'USA', '(123)-456-7890', NULL, NULL);

-- Question 2
USE northwind;

INSERT INTO products
VALUES(78, 'BBQ sauce', 30, 2, 1, .30, 5, 0, 1, 0);

-- Question 3
USE northwind; 

SELECT p.ProductName, s.CompanyName
From products p
JOIN suppliers s ON p.SupplierID = s.SupplierID;

-- Question 4
USE northwind;

UPDATE products
SET unitprice = UnitPrice * 1.15
WHERE ProductID = 78;

-- Question 5
USE northwind;

SELECT ProductName, UnitPrice
FROM products
WHERE SupplierID = 30;

-- Question 6
USE northwind;

DELETE FROM products
WHERE ProductID = 78;

-- Question 7
USE northwind;

DELETE FROM suppliers
WHERE SupplierID = 30;

-- Question 8
SELECT * FROM products;

-- Question 9
SELECT * FROM suppliers;