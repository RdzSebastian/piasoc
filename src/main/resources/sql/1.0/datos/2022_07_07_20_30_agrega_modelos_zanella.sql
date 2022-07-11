do $$ 
declare marca_nombre varchar := 'ZANELLA';
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
        VALUES ('BLACK',tipo_moto_id,marca_id,'2019',NULL);

     INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('CECCATO',tipo_moto_id,marca_id,'2017',NULL);

     INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('CRUISER',tipo_moto_id,marca_id,'2019',NULL);

     INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('DUE 110',tipo_moto_id,marca_id,'2011',NULL);

     INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('E-STYLER',tipo_moto_id,marca_id,'2015',NULL);

     INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('EXCLUSIVE 150',tipo_moto_id,marca_id,'2015',NULL);

     INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('FX',tipo_moto_id,marca_id,'2011',NULL);

     INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('GFORCE',tipo_moto_id,marca_id,'2011',NULL);

     INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('GT2',tipo_moto_id,marca_id,'2017',NULL);

     INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('GT2I',tipo_moto_id,marca_id,'2019',NULL);

     INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('HOT',tipo_moto_id,marca_id,'2011',NULL);

     INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('MOD 150',tipo_moto_id,marca_id,'2015',NULL);

     INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('MOTONETA 110',tipo_moto_id,marca_id,'2019',NULL);

     INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('PATAGONIA',tipo_moto_id,marca_id,'2011',NULL);

     INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('RKS 150',tipo_moto_id,marca_id,'2015',NULL);

     INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('RX',tipo_moto_id,marca_id,'2011',NULL);

     INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('RX1',tipo_moto_id,marca_id,'2015',NULL);

     INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('RZ',tipo_moto_id,marca_id,'2013',NULL);

     INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('RZ3',tipo_moto_id,marca_id,'2017',NULL);

     INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('RZ35',tipo_moto_id,marca_id,'2019',NULL);

     INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('S-TRUCK',tipo_moto_id,marca_id,'2019',NULL);

     INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('SAPUCAI',tipo_moto_id,marca_id,'2015',NULL);

     INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('SPEED 200',tipo_moto_id,marca_id,'2019',NULL);

     INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('STYLER',tipo_moto_id,marca_id,'2011',NULL);

     INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('TRICARGO',tipo_moto_id,marca_id,'2011',NULL);

     INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('TRUCK',tipo_moto_id,marca_id,'2011',NULL);

     INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('ZB 110',tipo_moto_id,marca_id,'2011',NULL);

     INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('ZB 125',tipo_moto_id,marca_id,'2011',NULL);

     INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('ZMAX 200',tipo_moto_id,marca_id,'2013',NULL);

     INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('ZR',tipo_moto_id,marca_id,'2019',NULL);

     INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('RZ7I',tipo_moto_id,marca_id,'2019',NULL);





    

      
end$$