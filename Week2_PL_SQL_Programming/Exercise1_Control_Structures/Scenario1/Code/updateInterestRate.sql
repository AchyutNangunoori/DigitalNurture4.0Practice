DECLARE
age NUMBER;
BEGIN
FOR cust IN (SELECT customerID, DOB FROM Customers) LOOP
age := FLOOR(MONTHS_BETWEEN(SYSDATE, cust.DOB)/12);
IF age>60 THEN
UPDATE Loans SET interestRate = interestRate - 1 WHERE customerID = cust.customerID;
END IF;
END LOOP;
END;
/