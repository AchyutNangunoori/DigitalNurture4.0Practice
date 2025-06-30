 CREATE OR REPLACE PACKAGE CustomerManagement AS
 PROCEDURE AddCustomer( cID IN Customers.customerID%TYPE, cName IN Customers.name%TYPE, cDOB IN Customers.DOB%TYPE, cBalance IN Customers.balance%TYPE, cIsVIP IN Customers.isVIP%TYPE);
 PROCEDURE UpdateCustomer( cID IN Customers.customerID%TYPE, cName IN Customers.name%TYPE, cDOB IN Customers.DOB%TYPE, cIsVIP IN Customers.isVIP%TYPE);
 FUNCTION getCustomerBalance( cCustomerID IN Customers.customerID%TYPE) RETURN NUMBER;
 END CustomerManagement;
 /

CREATE OR REPLACE PACKAGE BODY CustomerManagement AS
PROCEDURE AddCustomer( cID IN Customers.customerID%TYPE, cName IN Customers.name%TYPE, cDOB IN Customers.DOB%TYPE, cBalance IN Customers.balance%TYPE, cIsVIP IN Customers.isVIP%TYPE) IS
BEGIN
INSERT INTO Customers (customerID, name, DOB, balance, ISVIP) VALUES (cID, cName, cDOB, cBalance, cIsVIP);
COMMIT;
END AddCustomer;
PROCEDURE UpdateCustomer( cID IN Customers.customerID%TYPE, cName IN Customers.name%TYPE, cDOB IN Customers.DOB%TYPE, cIsVIP IN Customers.isVIP%TYPE) IS
BEGIN
UPDATE Customers SET customerID = cID, DOB = cDOB, isVIP = cIsVIP WHERE customerID = cID;
COMMIT;
END UpdateCustomer;
FUNCTION getCustomerBalance( cCustomerID IN Customers.customerID%TYPE) RETURN NUMBER IS
bal Customers.balance%TYPE;
BEGIN
SELECT balance INTO bal FROM Customers WHERE customerID = cCustomerID;
RETURN bal;
END getCustomerBalance;
END;
/

BEGIN
CustomerManagement.AddCustomer(12, 'John Smith', TO_DATE('15-JUL-1990', 'DD-MON-YYYY'), 5000, 'N');
CustomerManagement.UpdateCustomer(12, 'John A. Smith', TO_DATE('15-JUL-1990', 'DD-MON-YYYY'), 'Y');
DBMS_OUTPUT.PUT_LINE('Balance: ' || CustomerManagement.GetCustomerBalance(12));
END;
/