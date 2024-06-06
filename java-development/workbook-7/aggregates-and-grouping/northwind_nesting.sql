-- 1. what is the name of the most expensive product?
SELECT ProductName
FROM products
WHERE UnitPrice = (SELECT MAX(UnitPrice)
					FROM products);
-- Cte de Blaye

-- 2. what is the order id, shipping name and the shipping address of all orders shipped "via" federal shipping?
SELECT orderId, ShipName, ShipAddress
FROM orders
WHERE ShipVia = (SELECT ShipperID FROM Shippers WHERE companyName = "Federal Shipping");

-- 3. what is the order ids of the the orders that ordered "Sasquatch Ale"?
SELECT orderID
FROM `Order Details`
WHERE ProductID = (SELECT ProductID FROM  Products WHERE ProductName = "Sasquatch Ale");

-- 4
SELECT FirstName, LastName
FROM employees
WHERE EmployeeID = ( SELECT EmployeeID FROM Orders WHERE OrderID = 10266);

-- 5
SELECT companyName
FROM customers
WHERE customerID = (SELECT customerID FROM Orders WHERE OrderID = 10266);