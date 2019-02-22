---do not close till join room
--DISPLAY WHEN OCCUPIED OR NOT A STUFF
SELECT * FROM ROOM WHERE staff_id IS NOT NULL

SELECT * FROM ROOM WHERE staff_id IS  NULL

---this will work after the checkin table is update
SELECT * FROM ROOM WHERE R_occupied_by IS NOT NULL

---NUMBER OF OCCUPED ROOM 
SELECT COUNT( R_occupied_by ) AS TotalNumberOfOCCUPIEDROOM FROM ROOM
