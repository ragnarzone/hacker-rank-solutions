/*
MySQL Server
*/
DECLARE @P INT = 20
WHILE (@P > 0)
BEGIN
   PRINT REPLICATE('* ', @P)
   SET @P = @P - 1
END;