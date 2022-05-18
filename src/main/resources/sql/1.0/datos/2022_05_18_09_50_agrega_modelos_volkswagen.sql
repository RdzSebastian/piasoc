do $$ 
declare marca_nombre varchar := 'VOLKSWAGEN';
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
        VALUES ('AMAROK',tipo_auto_id,marca_id,'2010',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('BORA',tipo_auto_id,marca_id,'2000','2014');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('CADDY',tipo_auto_id,marca_id,'2000','2009');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('ESCARABAJO',tipo_auto_id,marca_id,'2003','2004');   

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('FOX',tipo_auto_id,marca_id,'2004',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('GOL',tipo_auto_id,marca_id,'2000',NULL);  

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('GOL COUNTRY',tipo_auto_id,marca_id,'2000','2011'); 

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('GOLF',tipo_auto_id,marca_id,'2000',NULL); 

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('MULTIVAN',tipo_auto_id,marca_id,'2007','2010');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('NEW BEETLE',tipo_auto_id,marca_id,'2000','2012');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('PASSAT',tipo_auto_id,marca_id,'2000',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('POLO',tipo_auto_id,marca_id,'2000',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('QUANTUM',tipo_auto_id,marca_id,'2000','2000');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('SANTANA',tipo_auto_id,marca_id,'2003','2007'); 

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('SAVEIRO',tipo_auto_id,marca_id,'2000',NULL); 

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('SCIROCCO',tipo_auto_id,marca_id,'2012',NULL); 

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('SHARAN',tipo_auto_id,marca_id,'2001','2016'); 

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('SURAN',tipo_auto_id,marca_id,'2006',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('T-CROSS',tipo_auto_id,marca_id,'2019',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('THE BEETLE',tipo_auto_id,marca_id,'2014',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('TIGUAN',tipo_auto_id,marca_id,'2008',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('TOUAREG',tipo_auto_id,marca_id,'2004',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('TRANSPORTER',tipo_auto_id,marca_id,'2000','2010');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('UP',tipo_auto_id,marca_id,'2014',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('VENTO',tipo_auto_id,marca_id,'2005',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('VIRTUS',tipo_auto_id,marca_id,'2018',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('VOYAGE',tipo_auto_id,marca_id,'2008',NULL);



end$$