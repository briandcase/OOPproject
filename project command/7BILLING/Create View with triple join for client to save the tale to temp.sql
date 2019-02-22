-- CREATE VIEW WITH TRIPE JOIN OPERTION TO SHOW THE PRECRITION OF THE PATIENT THEN SAVE TO TEMP TO ADD TOTAL PRICE
  CREATE VIEW [THE PATIENT TATOL] AS 
  SELECT prescription_id, Patient.P_FName, Patient.P_LName, medication.med_name, comment, PR_med_quantity, PR_price
  FROM prescription
  JOIN medication
  ON medication.med_id = prescription.med_id
    JOIN  Patient
  ON Patient.patient_id = prescription.patient_id
  WHERE prescription.patient_id = 'PN002' -- 1 ,2 ,3


  
  