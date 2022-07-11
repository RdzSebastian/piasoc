do $$ 
declare marca_nombre varchar := 'SUZUKI';
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
        VALUES ('AN 125',tipo_moto_id,marca_id,'2011',NULL);

   INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('AX 100',tipo_moto_id,marca_id,'2011',NULL);

   INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('BURGMAN 200A',tipo_moto_id,marca_id,'2019',NULL);

   INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('DL',tipo_moto_id,marca_id,'2011',NULL);

   INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('EN',tipo_moto_id,marca_id,'2011',NULL);

   INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('GIXXER',tipo_moto_id,marca_id,'2017',NULL);

   INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('GN 125',tipo_moto_id,marca_id,'2017',NULL);

   INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('GSX',tipo_moto_id,marca_id,'2011',NULL);

   INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('GSX-R',tipo_moto_id,marca_id,'2011',NULL);

   INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('GSX-S',tipo_moto_id,marca_id,'2017',NULL);

   INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('GW',tipo_moto_id,marca_id,'2013',NULL);

   INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('LT-A 500',tipo_moto_id,marca_id,'2013',NULL);

   INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('RM-Z',tipo_moto_id,marca_id,'2011',NULL);

   INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('RMX',tipo_moto_id,marca_id,'2013',NULL);

   INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('SV',tipo_moto_id,marca_id,'2017',NULL);

    
end$$