SELECT course_id AS COURSE_ID, SUM(exam_grade)/COUNT(course_id) AS GRADE
FROM exam_table
WHERE user_id = 'claws01'
GROUP BY course_id