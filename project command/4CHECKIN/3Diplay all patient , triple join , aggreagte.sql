--DISPLAY CHECKIN TABLE
SELECT * FROM checkin

---TRIPLE JOIN TO DISPLAY LEST OF THE PATIENT NAME DOC WHO TAKE CARE OF THEM
 SELECT checkin.patient_id, Patient.P_FName, Patient.P_LName, CHECKIN.room_id,CHECKIN.stuff_id, Staff.S_FName, Staff.S_LName, Staff.S_Title
  FROM checkin
  JOIN  Patient
  ON Patient.patient_id = checkin.patient_id
  JOIN Staff
  ON CHECKIN.stuff_id = Staff.staff_id
--total number of patient in check in
SELECT COUNT( patient_id ) AS TotalNumbPatientInCHECKin FROM checkin
--total number of patient who have benn assing to doc
SELECT COUNT( patient_id ) AS TotalNumbPatient FROM checkin where stuff_id IS NOT NULL