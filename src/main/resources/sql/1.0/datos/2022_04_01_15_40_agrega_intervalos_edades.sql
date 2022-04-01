do $$ 
declare 

begin

INSERT INTO intervalo_edad (id,intervalo)
	VALUES (1,'Menos 23');
INSERT INTO intervalo_edad (id,intervalo)
	VALUES (2,'Entre 23 y 30');
INSERT INTO intervalo_edad (id,intervalo)
	VALUES (3,'Entre 30 y 55');
INSERT INTO intervalo_edad (id,intervalo)
	VALUES (4,'Entre 55 y 65');
INSERT INTO intervalo_edad (id,intervalo)
	VALUES (5,'Entre 65 y 70');
INSERT INTO intervalo_edad (id,intervalo)
	VALUES (6,'Entre 70 y 75');
INSERT INTO intervalo_edad (id,intervalo)
	VALUES (7,'Mas de 75 ');
	
end$$