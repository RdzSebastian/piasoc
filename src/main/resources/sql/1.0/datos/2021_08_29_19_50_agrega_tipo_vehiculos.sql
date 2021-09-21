do $$ 
declare tipo_moto varchar := 'MOTO';
        tipo_auto varchar := 'AUTO';
        tipo_pickup varchar := 'PICKUP';
        tipo_camion varchar := 'CAMION';

begin

    INSERT INTO TIPO_VEHICULO (nombre)
        VALUES (tipo_moto);

    INSERT INTO TIPO_VEHICULO (nombre)
        VALUES (tipo_auto);

    INSERT INTO TIPO_VEHICULO (nombre)
        VALUES (tipo_pickup);

    INSERT INTO TIPO_VEHICULO (nombre)
        VALUES (tipo_camion);

end$$