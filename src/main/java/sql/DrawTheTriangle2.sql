/*
MySQL Server
*/
DECLARE @P INT = 1
WHILE (@P <= 20)
BEGIN
   PRINT REPLICATE('* ', @P)
   SET @P = @P + 1
END;