CREATE OR REPLACE PROCEDURE UpdateSalary (pemployeeID IN NUMBER, percentageIncrease IN NUMBER) AS
empCount NUMBER;
employeeNotFound EXCEPTION;
BEGIN
SELECT COUNT(*) INTO empCount FROM Employees WHERE employeeID = pemployeeID;
IF empCount=0 THEN
RAISE employeeNotFound;
END IF;
UPDATE Employees SET salary = salary + ((percentageIncrease/100)* salary) WHERE employeeID = pemployeeID;
COMMIT;
DBMS_OUTPUT.PUT_LINE('Salary Updated successfully');
EXCEPTION
WHEN employeeNotFound THEN
DBMS_OUTPUT.PUT_LINE('No employee with EmployeeID: ' || pemployeeID || ' found');
WHEN OTHERS THEN
DBMS_OUTPUT.PUT_LINE('Some unknown error occurred: ' || SQLERRM);
END;
/