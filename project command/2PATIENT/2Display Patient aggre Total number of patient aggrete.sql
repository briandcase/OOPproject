--display patient
SELECT patient_id, P_FName, P_LName, P_sex, P_Dob, P_Address, P_Contact FROM Patient
-- TATOL NUMBER OF PATIEN
SELECT COUNT( Patient_id ) AS TotalNumberOfPatient FROM Patient
-- GROUP BY GENDER 
SELECT P_Sex, COUNT(P_Sex) AS les_gender
FROM Patient
GROUP BY P_Sex
ORDER BY P_Sex;