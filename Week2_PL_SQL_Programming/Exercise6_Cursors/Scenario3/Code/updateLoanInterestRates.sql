SET SERVEROUTPUT ON;
DECLARE
CURSOR UpdateLoanInterestRates IS
SELECT loanID, interestRate FROM Loans;
lID Loans.loanID%TYPE;
interest Loans.interestRate%TYPE;
increase NUMBER  := 3;
BEGIN
Open UpdateLoanInterestRates;
LOOP
FETCH UpdateLoanInterestRates INTO lID, interest;
EXIT WHEN UpdateLoanInterestRates%NOTFOUND;
UPDATE Loans SET interestRate = interestRate + increase WHERE loanID = lID;
COMMIT;
DBMS_OUTPUT.PUT_LINE('Loan ID: ' || lID || ' Interest Rate: ' || interest);
SELECT interestRate INTO interest FROM Loans WHERE loanID = lID;
DBMS_OUTPUT.PUT_LINE('Updated Interest Rate: ' || interest);
END LOOP;
Close UpdateLoanInterestRates;
END;
/