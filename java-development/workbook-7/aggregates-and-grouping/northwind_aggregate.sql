-- 1. how many suppliers are there?
SELECT COUNT(*)
FROM suppliers;
-- 29

-- 2. what is the sum of all employees salaries?
SELECT SUM(salary) AS total_salary
FROM employees;
-- '$20363' rounded up from '20362.92'

-- 3. what is the price of the cheapest item that northwind sells?
SELECT MIN(UnitPrice) AS cheapest_price
From Products;
-- $2.50

-- 4. what is the average price of all items that northwind sells?
SELECT AVG(UnitPrice) AS avg_price
FROM products;
-- '$29' - rounded up from '28.86'

-- 5. what is the price of the most expensive item that northwind sells?
SELECT MAX(UnitPrice) AS max_price
FROM products;
-- 263.50

-- 6. what is the supplier id of each supplier and the number of items they supply? - must use product table


-- 7. what is the catergory id of each catergory and the avg price of each item in the catergory? - product table
SELECT CatergoryID, AVG(UnitPrice)
FROM products;

-- 8. 
