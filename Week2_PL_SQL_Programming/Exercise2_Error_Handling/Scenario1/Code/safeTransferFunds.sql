
CREATE OR REPLACE PROCEDURE SafeTransferFunds (sourceAccountID IN NUMBER, destinationAccountID IN NUMBER, amount IN NUMBER) AS
sourceBalance Accounts.Balance%TYPE;
insufficientFunds EXCEPTION;
BEGIN
SELECT Balance INTO sourceBalance FROM Accounts WHERE accountID = sourceAccountID;
IF sourceBalance<amount THEN
RAISE insufficientFunds;
END IF;
UPDATE Accounts SET Balance = Balance - amount, lastModified = SYSDATE WHERE accountID = sourceAccountID;
UPDATE Accounts SET Balance = Balance + amount, lastModified = SYSDATE WHERE accountID = destinationAccountID;
DBMS_OUTPUT.PUT_LINE('Ammount Transferred Safely');
COMMIT;
EXCEPTION
WHEN insufficientFunds THEN
ROLLBACK;
DBMS_OUTPUT.PUT_LINE('Insufficient balance in source account.');
WHEN OTHERS THEN
DBMS_OUTPUT.PUT_LINE('An unexpected error Occured' || SQLERRM);
END;
/