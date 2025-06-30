SET SERVEROUTPUT ON;
DECLARE
CURSOR ApplyAnnualFee IS
SELECT accountID, balance FROM Accounts;
accID Accounts.accountID%TYPE;
bal Accounts.balance%TYPE;
fee NUMBER := 200;
BEGIN
Open ApplyAnnualFee;
LOOP
FETCH ApplyAnnualFee INTO accID, bal;
EXIT WHEN ApplyAnnualFee%NOTFOUND;
UPDATE Accounts SET balance = bal - fee, lastModified = SYSDATE WHERE accountID = accID;
COMMIT;
DBMS_OUTPUT.PUT_LINE('Account ID: ' || accID || ' Balance: ' || bal);
SELECT balance INTO bal FROM Accounts WHERE accountID = accID;
DBMS_OUTPUT.PUT_LINE('Current Balance: ' || bal);
END LOOP;
Close ApplyAnnualFee;
END;
/