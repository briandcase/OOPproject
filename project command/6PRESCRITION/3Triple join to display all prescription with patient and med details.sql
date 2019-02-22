-- TRIPE JOIN OPERTION TO SHOW THE PRECRITION AND PATIENT , MED NAME AND ALL DETAILS
  SELECT prescription_id, Patient.P_FName, Patient.P_LName, medication.med_name, comment, PR_med_quantity, PR_price
  FROM prescription
  JOIN  Patient
  ON Patient.patient_id = prescription.patient_id
  JOIN medication
  ON medication.med_id = prescription.med_id