CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (Department IN VARCHAR2, BonusPercent IN NUMBER) AS
BEGIN
UPDATE Employees SET Salary = Salary + (BonusPercent/100 * Salary) WHERE Department=Department;
END;
/