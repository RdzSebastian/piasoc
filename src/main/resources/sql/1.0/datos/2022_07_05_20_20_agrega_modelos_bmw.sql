do $$ 
declare marca_nombre varchar := 'BMW';
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
        VALUES ('116',tipo_auto_id,marca_id,'2006','2016');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('118',tipo_auto_id,marca_id,'2010',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('120',tipo_auto_id,marca_id,'2005',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('125',tipo_auto_id,marca_id,'2008','2016');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('130',tipo_auto_id,marca_id,'2006','2012');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('135',tipo_auto_id,marca_id,'2009','2016');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('140',tipo_auto_id,marca_id,'2017',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('220',tipo_auto_id,marca_id,'2017',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('235',tipo_auto_id,marca_id,'2015','2017');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('240',tipo_auto_id,marca_id,'2017',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('316',tipo_auto_id,marca_id,'2001','2003');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('318',tipo_auto_id,marca_id,'2000','2013');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('320',tipo_auto_id,marca_id,'2000','2018');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('323',tipo_auto_id,marca_id,'2000','2010');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('325',tipo_auto_id,marca_id,'2001','2014');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('328',tipo_auto_id,marca_id,'2000','2016');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('330',tipo_auto_id,marca_id,'2001',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('335',tipo_auto_id,marca_id,'2007','2010');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('428',tipo_auto_id,marca_id,'2015','2016');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('430',tipo_auto_id,marca_id,'2016',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('435',tipo_auto_id,marca_id,'2015','2016');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('440',tipo_auto_id,marca_id,'2016',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('523',tipo_auto_id,marca_id,'2011','2013');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('525',tipo_auto_id,marca_id,'2000','2016');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('528',tipo_auto_id,marca_id,'2000','2013');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('530',tipo_auto_id,marca_id,'2000',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('535',tipo_auto_id,marca_id,'2010','2017');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('540',tipo_auto_id,marca_id,'2000',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('545',tipo_auto_id,marca_id,'2004','2007');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('550',tipo_auto_id,marca_id,'2006','2014');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('640',tipo_auto_id,marca_id,'2012','2017');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('645',tipo_auto_id,marca_id,'2004','2006');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('650',tipo_auto_id,marca_id,'2006',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('735',tipo_auto_id,marca_id,'2000','2000');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('740',tipo_auto_id,marca_id,'2000','2002');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('745',tipo_auto_id,marca_id,'2001','2006');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('750',tipo_auto_id,marca_id,'2000',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('850',tipo_auto_id,marca_id,'2019',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('M 1',tipo_auto_id,marca_id,'2012','2013');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('M 2',tipo_auto_id,marca_id,'2017',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('M 3',tipo_auto_id,marca_id,'2000',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('M 4',tipo_auto_id,marca_id,'2015',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('M 5',tipo_auto_id,marca_id,'2000',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('M 6',tipo_auto_id,marca_id,'2007',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('X 1',tipo_auto_id,marca_id,'2009',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('X 2',tipo_auto_id,marca_id,'2018',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('X 3',tipo_auto_id,marca_id,'2004',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('X 4',tipo_auto_id,marca_id,'2015',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('X 5',tipo_auto_id,marca_id,'2000',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('X 6',tipo_auto_id,marca_id,'2008',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('Z 3',tipo_auto_id,marca_id,'2000','2003');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('Z 4',tipo_auto_id,marca_id,'2003',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('Z 8',tipo_auto_id,marca_id,'2000','2005');

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('C 650',tipo_moto_id,marca_id,'2013',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('F 750',tipo_moto_id,marca_id,'2018',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('F 850',tipo_moto_id,marca_id,'2018',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('G 310',tipo_moto_id,marca_id,'2017',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('HP4 1000',tipo_moto_id,marca_id,'2015',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('K 1600',tipo_moto_id,marca_id,'2013',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('R 1200',tipo_moto_id,marca_id,'2011',NULL);

    INSERT INTO MODELO (nombre, tipo_vehiculo_id, marca_id, anio_desde, anio_hasta)
        VALUES ('S 1000',tipo_moto_id,marca_id,'2011',NULL);


   
end$$