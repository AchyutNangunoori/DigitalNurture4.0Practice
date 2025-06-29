CREATE OR REPLACE PROCEDURE addNewCustomer (pCustomerID IN NUMBER, pName IN VARCHAR2, pDOB IN DATE, pBalance IN NUMBER, pIsVIP IN VARCHAR2) AS
customerCount NUMBER;
customerExists EXCEPTION;
BEGIN
SELECT COUNT(*) INTO customerCount FROM Customers WHERE customerID = pCustomerID;
IF customerCount>0 THEN
RAISE customerExists;
END IF;
INSERT INTO Customers(customerID, name, DOB, balance, IsVIP) VALUES(pCustomerID, pName, pDOB, pBalance, pIsVIP);
COMMIT;
DBMS_OUTPUT.PUT_LINE('Customer inserted successfully');
EXCEPTION
WHEN customerExists THEN
DBMS_OUTPUT.PUT_LINE('Customer with CustomerID: ' || pCustomerID || ' already exists');
WHEN OTHERS THEN
DBMS_OUTPUT.PUT_LINE('Some unknown error occurred: ' || SQLERRM);
END;
/