--dispaly all room
SELECT * FROM ROOM
--JOIN ROOM AND STAFF TO Dispplay all room assgin to a Nurse with name
SELECT Room.room_id, Staff.S_FName,Staff.S_LName, Staff.S_Title
FROM Room
INNER JOIN Staff
ON Room.staff_id=Staff.staff_id;

--JOIN Rroom id and stuff id
SELECT Room.room_id, Staff.staff_id, Staff.S_FName,Staff.S_LName, Staff.S_Title
FROM Room
INNER JOIN Staff
ON Room.staff_id=Staff.staff_id;

