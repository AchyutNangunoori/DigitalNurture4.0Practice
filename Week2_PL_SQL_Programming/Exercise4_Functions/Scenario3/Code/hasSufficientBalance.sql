CREATE OR REPLACE FUNCTION HasSufficientBalance (pAccountID IN NUMBER, pAmount IN NUMBER) RETURN BOOLEAN IS
accBalance NUMBER;
BEGIN
SELECT balance INTO accBalance FROM Accounts WHERE accountID = pAccountID;
RETURN accBalance>=pAmount;
END;
/