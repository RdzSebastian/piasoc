do $$ 
declare marca varchar := 'FIAT';
        tipo_moto varchar := 'MOTO';
        tipo_auto varchar := 'AUTO';
        tipo_utilitario varchar := 'UTILITARIO';
        tipo_camion varchar := 'CAMION';
        modelo_id int := 0;
begin

    INSERT INTO MODELO (nombre, anio_desde, anio_hasta)
        VALUES ('UNO','1983',NULL);
    
    modelo_id := (SELECT id FROM MODELO WHERE nombre = 'UNO');
     
    INSERT INTO VEHICULO (marca, modelo_id, tipo)
        VALUES (marca, modelo_id, tipo_auto);
    
    INSERT INTO MODELO (nombre, anio_desde, anio_hasta)
        VALUES ('IDEA','2004','2016');
    
    modelo_id = modelo_id  + 1;
    
    INSERT INTO VEHICULO (marca, modelo_id, tipo)
        VALUES (marca, modelo_id, tipo_auto);
    
    INSERT INTO MODELO (nombre, anio_desde, anio_hasta)
        VALUES ('PUNTO','2007','2017');
    
    modelo_id = modelo_id  + 1;
    
    INSERT INTO VEHICULO (marca, modelo_id, tipo)
        VALUES (marca, modelo_id, tipo_auto);
    
    INSERT INTO MODELO (nombre, anio_desde, anio_hasta)
        VALUES ('147','1982','1997');
    
    modelo_id = modelo_id  + 1;
    
    INSERT INTO VEHICULO (marca, modelo_id, tipo)
        VALUES (marca, modelo_id, tipo_auto);
    
    INSERT INTO MODELO (nombre, anio_desde, anio_hasta)
        VALUES ('PALIO','1996','2018');
    
    modelo_id = modelo_id  + 1;
    
    INSERT INTO VEHICULO (marca, modelo_id, tipo)
        VALUES (marca, modelo_id, tipo_auto);
    
    INSERT INTO MODELO (nombre, anio_desde, anio_hasta)
        VALUES ('DUNA','1973','2001');
    
    modelo_id = modelo_id  + 1;
    
    INSERT INTO VEHICULO (marca, modelo_id, tipo)
        VALUES (marca, modelo_id, tipo_auto);
    
    INSERT INTO MODELO (nombre, anio_desde, anio_hasta)
        VALUES ('SIENA','1996','2017');
    
    modelo_id = modelo_id  + 1;
    
    INSERT INTO VEHICULO (marca, modelo_id, tipo)
        VALUES (marca, modelo_id, tipo_auto);
    
    INSERT INTO MODELO (nombre, anio_desde, anio_hasta)
        VALUES ('STILO','2001','2010');
    
    modelo_id = modelo_id  + 1;
    
    INSERT INTO VEHICULO (marca, modelo_id, tipo)
        VALUES (marca, modelo_id, tipo_auto);
    
    INSERT INTO MODELO (nombre, anio_desde, anio_hasta)
        VALUES ('TIPO','1988','1995');
    
    modelo_id = modelo_id  + 1;
    
    INSERT INTO VEHICULO (marca, modelo_id, tipo)
        VALUES (marca, modelo_id, tipo_auto);
    
    INSERT INTO MODELO (nombre, anio_desde, anio_hasta)
        VALUES ('500','2013',NULL);
    
    modelo_id = modelo_id  + 1;
    
    INSERT INTO VEHICULO (marca, modelo_id, tipo)
        VALUES (marca, modelo_id, tipo_auto);
    
    INSERT INTO MODELO (nombre, anio_desde, anio_hasta)
        VALUES ('ARGO','2018',NULL);
    
    modelo_id = modelo_id  + 1;
    
    INSERT INTO VEHICULO (marca, modelo_id, tipo)
        VALUES (marca, modelo_id, tipo_auto);
    
    INSERT INTO MODELO (nombre, anio_desde, anio_hasta)
        VALUES ('CRONOS','2018',NULL);
    
    modelo_id = modelo_id  + 1;
    
    INSERT INTO VEHICULO (marca, modelo_id, tipo)
        VALUES (marca, modelo_id, tipo_auto);
    
    INSERT INTO MODELO (nombre, anio_desde, anio_hasta)
        VALUES ('FIORINO','1977',NULL);
    
    modelo_id = modelo_id  + 1;
    
    INSERT INTO VEHICULO (marca, modelo_id, tipo)
        VALUES (marca, modelo_id, tipo_utilitario);
    
    INSERT INTO MODELO (nombre, anio_desde, anio_hasta)
        VALUES ('DUCATO','1981',NULL);
    
    modelo_id = modelo_id  + 1;
    
    INSERT INTO VEHICULO (marca, modelo_id, tipo)
        VALUES (marca, modelo_id, tipo_utilitario);
    
    INSERT INTO MODELO (nombre, anio_desde, anio_hasta)
        VALUES ('STRADA','1996',NULL);
    
    modelo_id = modelo_id  + 1;
    
    INSERT INTO VEHICULO (marca, modelo_id, tipo)
        VALUES (marca, modelo_id, tipo_utilitario);

end$$
