CREATE OR REPLACE PACKAGE AccountOperations AS
PROCEDURE OpenAccount( accID IN Accounts.accountID%TYPE, cID IN Accounts.customerID%TYPE, accType IN Accounts.accountType%TYPE, bal IN Accounts.balance%TYPE);
PROCEDURE CloseAccount( accID IN Accounts.accountID%TYPE);
FUNCTION getTotalBalance( cID IN Accounts.customerID%TYPE) RETURN NUMBER;
END;
/

CREATE OR REPLACE PACKAGE BODY AccountOperations AS
PROCEDURE OpenAccount( accID IN Accounts.accountID%TYPE, cID IN Accounts.customerID%TYPE, accType IN Accounts.accountType%TYPE, bal IN Accounts.balance%TYPE) IS
BEGIN
INSERT INTO Accounts (accountID, customerID, accountType, balance, lastModified) VALUES (accID, cID, accType, bal, SYSDATE);
COMMIT;
END;
PROCEDURE CloseAccount( accID IN Accounts.accountID%TYPE) IS
BEGIN
DELETE FROM Accounts WHERE accountID = accID;
COMMIT;
END;
FUNCTION getTotalBalance( cID IN Accounts.customerID%TYPE) RETURN NUMBER IS
totalBalance NUMBER;
BEGIN
SELECT SUM(balance) INTO totalBalance FROM Accounts WHERE customerID = cID;
RETURN totalBalance;
END;
END;
/

BEGIN
AccountOperations.OpenAccount(20, 5, 'Savings', 7000);
AccountOperations.CloseAccount(10);
DBMS_OUTPUT.PUT_LINE('Total Balance for Customer 5: ' || AccountOperations.GetTotalBalance(5));
END;
/