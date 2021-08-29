CREATE table MODELO
(
    id serial NOT null PRIMARY KEY,
    nombre character varying(20) not null,
    anio_desde int not null,
    anio_hasta int
);