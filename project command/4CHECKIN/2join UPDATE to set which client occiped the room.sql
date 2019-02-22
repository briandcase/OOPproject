-- USING  JOIN AND UPDATE TO SELECT patient id and copy those inside the room occupied by them
  UPDATE Room
SET R_occupied_by = checkin.patient_id
FROM checkin
JOIN Room
    ON Room.room_id = checkin.room_id
WHERE Room.room_id = checkin.room_id