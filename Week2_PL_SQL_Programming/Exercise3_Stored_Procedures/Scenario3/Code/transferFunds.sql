CREATE OR REPLACE PROCEDURE TransferFunds (sourceAccountID IN NUMBER, destinationAccountID IN NUMBER, amount IN NUMBER) AS
sourceBalance Accounts.Balance%TYPE;
BEGIN
SELECT Balance INTO sourceBalance FROM Accounts WHERE accountID = sourceAccountID;
IF sourceBalance<amount THEN
DBMS_OUTPUT.PUT_LINE('Insufficient balance in source account.');
ELSE
UPDATE Accounts SET Balance = Balance - amount, lastModified = SYSDATE WHERE accountID = sourceAccountID;
UPDATE Accounts SET Balance = Balance + amount, lastModified = SYSDATE WHERE accountID = destinationAccountID;
END IF;
COMMIT;
END;
/