do $$ 
declare 

begin
INSERT INTO intervalo_kilometros (id,intervalo)
	VALUES (1,'Hasta 8.000');
INSERT INTO intervalo_kilometros (id,intervalo)
	VALUES (2,'De 8.001 a 15.000');
INSERT INTO intervalo_kilometros (id,intervalo)
	VALUES (3,'De 15.001 a 30.000');
INSERT INTO intervalo_kilometros (id,intervalo)
	VALUES (4,'Mas de 30.000');
end$$