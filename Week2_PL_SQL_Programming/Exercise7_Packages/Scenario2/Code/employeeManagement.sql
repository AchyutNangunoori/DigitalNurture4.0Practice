CREATE OR REPLACE PACKAGE EmployeeManagement AS
PROCEDURE HireEmployee( eID IN Employees.employeeID%TYPE, eName IN Employees.name%TYPE, eHireDate IN Employees.hireDate%TYPE, eDept IN Employees.department%TYPE, eSalary IN Employees.salary%TYPE);
PROCEDURE UpdateEmployee( eID IN Employees.employeeID%TYPE, eName IN Employees.name%TYPE, eDept IN Employees.department%TYPE, eSalary IN Employees.salary%TYPE);
FUNCTION GetAnnualSalary(eID IN Employees.employeeID%TYPE) RETURN NUMBER;
END;
/

CREATE OR REPLACE PACKAGE BODY EmployeeManagement AS
PROCEDURE HireEmployee( eID IN Employees.employeeID%TYPE, eName IN Employees.name%TYPE, eHireDate IN Employees.hireDate%TYPE, eDept IN Employees.department%TYPE, eSalary IN Employees.salary%TYPE) IS
BEGIN
INSERT INTO Employees (employeeID, name, hireDate, department, salary) VALUES (eID, eName, eHireDate, eDept, eSalary);
COMMIT;
END;
PROCEDURE UpdateEmployee( eID IN Employees.employeeID%TYPE, eName IN Employees.name%TYPE, eDept IN Employees.department%TYPE, eSalary IN Employees.salary%TYPE) IS
BEGIN
UPDATE Employees SET name = eName, department = eDept, salary = eSalary WHERE employeeID = eID;
COMMIT;
END;
FUNCTION GetAnnualSalary(eID IN Employees.employeeID%TYPE) RETURN NUMBER IS
yearlySalary Employees.salary%TYPE;
BEGIN
SELECT (salary*12) INTO yearlySalary FROM Employees WHERE employeeID = eID;
RETURN yearlySalary;
END;
END;
/


BEGIN
EmployeeManagement.HireEmployee(101, 'Alice Johnson', TO_DATE('01-JUL-2020', 'DD-MON-YYYY'), 'Finance', 45000);
EmployeeManagement.UpdateEmployee(101, 'Alice J.', 'Finance', 47000);
DBMS_OUTPUT.PUT_LINE('Annual Salary: ' || EmployeeManagement.GetAnnualSalary(101));
END;
/