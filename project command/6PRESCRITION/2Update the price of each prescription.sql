-- USING UPDATE AND JOIN ON  PRESCRITION PRICE BY JOIN THE MEDICATION TO RETRIVE PRICE AND MULT THAT PRICE BY THE CORRESPONDING MED QUATITY 
  UPDATE prescription
SET PR_price = PR_med_quantity * medication.med_price
FROM prescription
JOIN medication
    ON medication.med_id = prescription.med_id
--WHERE  medication.med_id = prescription.med_id