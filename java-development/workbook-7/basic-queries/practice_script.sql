-- Question 1 
SELECT * FROM Customers;

-- Question 2 
SELECT City FROM Customers;

-- Question 3
SELECT DISTINCT Country FROM Customers;

-- Question 4
SELECT * FROM Customers
WHERE City = "Berlin";

-- Question 5
SELECT * FROM Customers
WHERE Customer_Id = 32;

-- Question 6
SELECT * FROM Customers
ORDER BY City;

-- Question 7
SELECT * FROM Customers
ORDER BY City DESC;

-- Question 8
SELECT * FROM Customers
ORDER BY Country, City;

-- Question 9
SELECT * FROM Customers
WHERE City = "Berlin"
AND PostalCode = "12209";

-- Question 10
SELECT * FROM Customers
WHERE City = "Berlin"
OR City = "London";

-- Question 11
SELECT * FROM Customers
WHERE NOT City = "Berlin";

-- Question 12
SELECT * FROM Customers


