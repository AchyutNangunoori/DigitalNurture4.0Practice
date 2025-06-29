BEGIN
FOR cust IN (SELECT customerID, Balance FROM Customers) LOOP
IF cust.Balance>10000 THEN
UPDATE Customers SET IsVIP = 'Y' WHERE customerID = cust.customerID;
ELSE
UPDATE Customers SET IsVIP = 'N' WHERE customerID = cust.customerID;
END IF;
END LOOP;
END;
/