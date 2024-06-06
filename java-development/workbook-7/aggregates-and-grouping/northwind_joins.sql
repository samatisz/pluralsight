
-- 1. 
SELECT p.productId, p.productName, p.UnitPrice, c.CategoryName
FROM products AS p
INNER JOIN categories AS c ON p.CategoryID = c.CategoryID
ORDER BY c.CategoryName, p.ProductName;

-- 2.
-- list product id, product name, unit price, supplier name 
-- name all products that cost more than $75
SELECT p.ProductID, p.ProductName, p.UnitPrice, s.SupplierName
FROM products AS p
INNER JOIN suppliers AS s ON p.SupplierID = s.SupplierID
WHERE p.UnitPrice > 75
ORDER BY p.ProdctName; -- not working

