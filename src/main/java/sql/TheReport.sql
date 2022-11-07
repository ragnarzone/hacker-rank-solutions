SELECT IF(GRADES.GRADE < 8, NULL, STUDENTS.NAME), GRADES.GRADE, STUDENTS.MARKS
FROM STUDENTS INNER JOIN GRADES
WHERE STUDENTS.MARKS BETWEEN MIN_MARK AND MAX_MARK
ORDER BY GRADES.GRADE DESC, STUDENTS.NAME;