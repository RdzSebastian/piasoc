do $$ 
declare marca_nombre varchar := 'FERRARI';
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
        VALUES ('355',tipo_auto_id,marca_id,'2000','2001');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('360',tipo_auto_id,marca_id,'2000','2006');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('430',tipo_auto_id,marca_id,'2005','2013');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('456',tipo_auto_id,marca_id,'2000','2006');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('458',tipo_auto_id,marca_id,'2012','2013');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('488',tipo_auto_id,marca_id,'2018',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('550',tipo_auto_id,marca_id,'2000','2006');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('599',tipo_auto_id,marca_id,'2007','2013');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('612',tipo_auto_id,marca_id,'2006','2013');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('CALIFORNIA',tipo_auto_id,marca_id,'2013','2013');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('F 12',tipo_auto_id,marca_id,'2013','2013');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('FF',tipo_auto_id,marca_id,'2013','2013');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('SUPERAMERICA',tipo_auto_id,marca_id,'2006','2007');


end$$