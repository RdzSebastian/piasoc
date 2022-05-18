do $$ 
declare marca_nombre varchar := 'ALFA ROMEO';
        marca_id int := 0;
        tipo_moto varchar := 'MOTO';
        tipo_auto varchar := 'AUTO';
        tipo_pickup varchar := 'PICKUP';
        tipo_camion varchar := 'CAMION';
        tipo_moto_id int := 0;
        tipo_auto_id int := 0;
        tipo_pickup_id int := 0;
        tipo_camion_id int := 0;

begin

    tipo_moto_id :=(SELECT id FROM TIPO_VEHICULO WHERE nombre = tipo_moto);
    tipo_auto_id := (SELECT id FROM TIPO_VEHICULO WHERE nombre = tipo_auto);
    tipo_pickup_id := (SELECT id FROM TIPO_VEHICULO WHERE nombre = tipo_pickup);
    tipo_camion_id := (SELECT id FROM TIPO_VEHICULO WHERE nombre = tipo_camion);

    marca_id := (SELECT id FROM MARCA WHERE nombre = marca_nombre);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('145',tipo_auto_id,marca_id,'2000','2002');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('146',tipo_auto_id,marca_id,'2000','2002');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('147',tipo_auto_id,marca_id,'2002','2011');
    
    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('156',tipo_auto_id,marca_id,'2000','2006');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('159',tipo_auto_id,marca_id,'2006','2013');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('166',tipo_auto_id,marca_id,'2000','2004');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('BRERA',tipo_auto_id,marca_id,'2007','2012');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('GIULIA',tipo_auto_id,marca_id,'2018', NULL);
    
    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('GIULIETTA',tipo_auto_id,marca_id,'2011', NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('GT',tipo_auto_id,marca_id,'2006','2011');
    
    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('GTV',tipo_auto_id,marca_id,'2000','2004');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('MITO',tipo_auto_id,marca_id,'2009', NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('SPIDER',tipo_auto_id,marca_id,'2000','2012');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('STELVIO',tipo_auto_id,marca_id,'2018', NULL);
    
    



end$$