SET SERVEROUTPUT ON;
BEGIN
FOR cust IN (SELECT l.loanID, l.customerID, l.ENDDATE, c.name FROM Loans l JOIN Customers c ON l.customerID = c.customerID) LOOP
IF cust.ENDDATE-SYSDATE<=30 AND cust.ENDDATE-SYSDATE>0 THEN
DBMS_OUTPUT.PUT_LINE('Customer '||cust.name||' with id : '||cust.CustomerID||' has loan due under 30 days');
END IF;
END LOOP;
END;
/