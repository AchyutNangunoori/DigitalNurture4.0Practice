CREATE OR REPLACE TRIGGER CheckTransactionRules
BEFORE INSERT ON Transactions
FOR EACH ROW
DECLARE
accBalance NUMBER;
negativeWithdrawal   EXCEPTION;
exceedsBalance     EXCEPTION;
negativeDeposit      EXCEPTION;
invalidTransaction   EXCEPTION;
BEGIN
  SELECT balance INTO accBalance FROM Accounts WHERE AccountID = :NEW.AccountID;
IF LOWER(:NEW.TransactionType) = 'withdrawal' THEN
    IF :NEW.Amount <= 0 THEN
      RAISE negativeWithdrawal;
    ELSIF accBalance < :NEW.Amount THEN
      RAISE exceedsBalance;
    END IF;
ELSIF LOWER(:NEW.TransactionType) = 'deposit' THEN
    IF :NEW.Amount <= 0 THEN
      RAISE negativeDeposit;
    END IF;
ELSE
    RAISE invalidTransaction;
END IF;
EXCEPTION
  WHEN negativeWithdrawal THEN
    RAISE_APPLICATION_ERROR(-20001, 'Withdrawal amount must be positive.');
  WHEN exceedsBalance THEN
    RAISE_APPLICATION_ERROR(-20002, 'Withdrawal amount exceeds current balance.');
  WHEN negativeDeposit THEN
    RAISE_APPLICATION_ERROR(-20003, 'Deposit amount must be positive.');
  WHEN invalidTransaction THEN
    RAISE_APPLICATION_ERROR(-20004, 'Invalid transaction type. Must be ''withdrawal'' or ''deposit''.');
  WHEN OTHERS THEN
    RAISE_APPLICATION_ERROR(-20099, 'Unknown error: ' || SQLERRM);
END;
/