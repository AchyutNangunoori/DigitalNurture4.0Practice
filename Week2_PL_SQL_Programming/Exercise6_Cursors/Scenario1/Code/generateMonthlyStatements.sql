SERVEROUTPUT ON;
DECLARE
CURSOR GenerateMonthlyStatements IS
SELECT c.customerID, c.name, a.accountID, t.transactionID, t.transactionDate, t.amount, t.transactionType
FROM
Accounts a
JOIN Customers c ON a.customerID = c.customerID
JOIN Transactions t ON a.accountID = t.accountID
WHERE TRUNC(t.transactionDate, 'MM') = TRUNC(SYSDATE, 'MM');
custID Customers.customerID%TYPE;
cName Customers.name%TYPE;
accID Accounts.accountID%TYPE;
transID Transactions.transactionID%TYPE;
transDate Transactions.transactionDate%TYPE;
transactionAmount Transactions.amount%TYPE;
transType Transactions.transactionType%TYPE;
BEGIN
OPEN GenerateMonthlyStatements;
LOOP
FETCH GenerateMonthlyStatements INTO custID, cName, accID, transID, transDate, transactionAmount, transType;
EXIT WHEN GenerateMonthlyStatements%NOTFOUND;
DBMS_OUTPUT.PUT_LINE('Customer ID: ' || custID || ' Customer Name: ' || cName || ' Account ID: ' || accID || ' Transaction ID: ' || transID || ' Transaction Date: ' || transDate || ' Transaction Amount: ' || transactionAmount || ' Transaction Type: ' || transType);
END LOOP;
CLOSE GenerateMonthlyStatements;
END;
/