-- Question 1
SELECT COUNT(*)
FROM northwind.suppliers;

-- Question 2
SELECT SUM(salary)
FROM northwind.employees;

-- Question 3
SELECT min(unitprice) AS cheapest_product
FROM northwind.products;

-- Question 4
SELECT AVG(unitprice) AS price_average
FROM northwind.products;

-- Question 5 
SELECT max(unitprice) AS most_expensive_product
FROM northwind.products;

-- Question 6 
SELECT supplierID, COUNT(*) AS ItemCount
FROM northwind.products
GROUP BY SupplierID;

-- Question 7
SELECT CategoryID, AVG(unitprice) AS AveragePrice
FROM northwind.products
GROUP BY CategoryID;

-- Question 8
SELECT SupplierID, COUNT(*) AS NumberOfItems
FROM northwind.products
GROUP BY SupplierID
HAVING NumberOfItems >= 5;