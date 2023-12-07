-- Question 1
SELECT ProductID, ProductName, UnitPrice, CategoryName
FROM northwind.products p
INNER JOIN northwind.categories c
ON p.CategoryID = c.CategoryID
ORDER BY c.CategoryName, p.ProductName;

-- Question 2
USE northwind;

SELECT p.ProductID, p.ProductName, p.UnitPrice, s.CompanyName
FROM Products p
JOIN Suppliers s ON p.SupplierID = p.SupplierID
WHERE p.UnitPrice > 75
ORDER BY p.ProductName;

-- Question 3
SELECT ProductID, ProductName, UnitPrice, CategoryName, CompanyName AS SupplierName
FROM northwind.products
Inner Join northwind.suppliers
On Products.SupplierID = Suppliers.SupplierID
INNER JOIN northwind.Categories
ON Products.CategoryID = Categories.CategoryID
ORDER BY ProductName;

-- Question 4
USE northwind;

SELECT p.ProductName, c.CategoryName
FROM products p
JOIN categories c ON p.CategoryID = c.CategoryID
WHERE p.UnitPrice = (
SELECT MAX(unitprice)
FROM products);

-- Question 5
USE northwind;

SELECT o.OrderID, o.ShipName, o.ShipAddress, s.CompanyName
FROM orders o
JOIN shippers s ON o.ShipVia = s.ShipperID
WHERE o.ShipCountry = "Germany";

-- Question 6
USE northwind;

SELECT o.OrdersID, o.OrderDate, o.ShipName, o.ShipAddress
FROM orders o
JOIN ordersdetails od ON o.OrderID = od.OrderID
JOIN products p ON od.ProductID = p.ProductID
WHERE p.ProductsName = "Sasquatch Ale";