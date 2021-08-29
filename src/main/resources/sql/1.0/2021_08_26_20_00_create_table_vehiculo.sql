CREATE table VEHICULO
(
    id serial NOT null PRIMARY KEY,
    marca character varying(20) not null,
    modelo_id INT references modelo not null, 
    tipo varchar (20 ) not null
);
