do $$ 
declare marca varchar := 'AUDI';
        tipo_moto varchar := 'MOTO';
        tipo_auto varchar := 'AUTO';
        tipo_utilitario varchar := 'UTILITARIO';
        tipo_camion varchar := 'CAMION';
        modelo_id int := 0;
begin

    INSERT INTO MODELO (nombre, anio_desde, anio_hasta)
        VALUES ('A6','1994', NULL);
    
    modelo_id := (SELECT id FROM MODELO WHERE nombre = 'A6');
    
    INSERT INTO VEHICULO (marca, modelo_id, tipo)
        VALUES (marca, modelo_id, tipo_auto);
    
    INSERT INTO MODELO (nombre, anio_desde, anio_hasta)
        VALUES ('A5','2007',NULL);
    
    modelo_id = modelo_id  + 1;
    
    INSERT INTO VEHICULO (marca, modelo_id, tipo)
        VALUES (marca, modelo_id, tipo_auto);
    
    INSERT INTO MODELO (nombre, anio_desde, anio_hasta)
        VALUES ('A4','1995',NULL);
    
    modelo_id = modelo_id  + 1;
    
    INSERT INTO VEHICULO (marca, modelo_id, tipo)
        VALUES (marca, modelo_id, tipo_auto);
    
    INSERT INTO MODELO (nombre, anio_desde, anio_hasta)
        VALUES ('A3','1996',NULL);
    
    modelo_id = modelo_id  + 1;
    
    INSERT INTO VEHICULO (marca, modelo_id, tipo)
        VALUES (marca, modelo_id, tipo_auto);
    
    INSERT INTO MODELO (nombre, anio_desde, anio_hasta)
        VALUES ('TT','1998',NULL);
    
    modelo_id = modelo_id  + 1;
    
    INSERT INTO VEHICULO (marca, modelo_id, tipo)
        VALUES (marca, modelo_id, tipo_auto);
    
    INSERT INTO MODELO (nombre, anio_desde, anio_hasta)
        VALUES ('Q7','2006',NULL);
    
    modelo_id = modelo_id  + 1;
    
    INSERT INTO VEHICULO (marca, modelo_id, tipo)
        VALUES (marca, modelo_id, tipo_auto);
    
    INSERT INTO MODELO (nombre, anio_desde, anio_hasta)
        VALUES ('Q5','2008',NULL);
    
    modelo_id = modelo_id  + 1;
    
    INSERT INTO VEHICULO (marca, modelo_id, tipo)
        VALUES (marca, modelo_id, tipo_auto);
    
    INSERT INTO MODELO (nombre, anio_desde, anio_hasta)
        VALUES ('Q3','2011',NULL);
    
    modelo_id = modelo_id  + 1;
    
    INSERT INTO VEHICULO (marca, modelo_id, tipo)
        VALUES (marca, modelo_id, tipo_auto);

end$$