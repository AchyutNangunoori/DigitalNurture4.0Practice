CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment (pLoanAmount IN NUMBER, pInterestRate IN NUMBER, pDurationYears IN NUMBER) RETURN NUMBER IS
monthlyRate NUMBER;
totalMonths NUMBER;
emi NUMBER;
BEGIN
monthlyRate := pInterestRate / 12 / 100;
totalMonths := pDurationYears * 12;
emi := pLoanAmount * monthlyRate * POWER(1 + monthlyRate, totalMonths) / (POWER(1 + monthlyRate, totalMonths) - 1);
RETURN ROUND(emi, 2);
END;
/