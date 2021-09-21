CREATE table MODELO
(
    id serial NOT null PRIMARY KEY,
    nombre character varying(20),
    tipo_vehiculo_id INT references TIPO_VEHICULO, 
    marca_id INT references MARCA,
    anio_desde int,
    anio_hasta int
);