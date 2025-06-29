CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
UPDATE Accounts SET Balance = Balance + (0.01*Balance) WHERE AccountType='Savings';
COMMIT;
END;
/