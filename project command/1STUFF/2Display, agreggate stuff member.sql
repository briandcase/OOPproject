--display all stuff
SELECT staff_id, S_FName, S_LName, S_sex, S_Dob, S_Address, S_Contact, S_Title FROM Staff
--COUNT THE NUMBER OF STUFF
SELECT COUNT( staff_id ) AS TotalNumberofStuff FROM Staff
-- TOTAL NUMBER BY TITLE nurse
SELECT COUNT(staff_id) AS total_nurse
FROM Staff
WHERE S_Title = 'Nurse';
-- TOTAL NUMBER BY TITLE doc
SELECT COUNT(staff_id) AS total_doc
FROM Staff
WHERE S_Title = 'Doctor';
-- GROUP BY TITLE 
SELECT S_Title, COUNT(S_Title) AS les_Trite, SUM(S_salary) AS les_salary
FROM Staff
GROUP BY S_Title
ORDER BY S_Title;