---ADD patient , stuff , room and check in dat to checkin table
UPDATE checkin 
SET room_id = 'R200',  stuff_id = 'S102' ,ch_in_date = '2018-10-01' 
WHERE patient_id = 'PN001';

UPDATE checkin 
SET room_id = 'R201',  stuff_id = 'S104' ,ch_in_date = '2018-10-01' 
WHERE patient_id = 'PN002';

UPDATE checkin 
SET room_id = 'R202',  stuff_id = 'S102' ,ch_in_date = '2018-10-01' 
WHERE patient_id = 'PN003';

UPDATE checkin 
SET ch_in_date = '2018-10-01' 
WHERE patient_id = 'PN004';

UPDATE checkin 
SET ch_in_date = '2018-10-01' 
WHERE patient_id = 'PN005';
