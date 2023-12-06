-- Question 1
SELECT ProductName
FROM northwind.products
WHERE UnitPrice - (SELECT MAX(UnitPrice)
FROM northwind.products);

-- Question 2
SELECT OrderID, ShipName, ShipAddress, ShipVia
FROM northwind.orders
WHERE ShipVia = (SELECT shipperID FROM northwind.shippersi
WHERE CompanyName = "Federal Shipping");

-- Question 3
SELECT OrderID
FROM northwind.'order details'
WHERE ProductID = (SELECT ProductID
FROM northwind.products
WHERE ProductName = "Sasquatch Ale");

-- Question 4
SELECT firstName, lastName
FROM northwind.employees
WHERE EmployeeID = (SELECT EmployeeID 
FROM northwind.orders
WHERE OrderID = 10266);

-- Question 5
SELECT CompanyName
FROM northwind.customers
WHERE CustomerID = (SELECT CustomerID
FROM northwind.orders
WHERE OrderID = 10266);