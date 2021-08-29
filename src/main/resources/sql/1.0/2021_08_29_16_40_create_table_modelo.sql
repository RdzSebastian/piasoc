CREATE table Modelo
(
    id serial NOT null PRIMARY KEY,
    nombre character varying(20),
    anio_desde date,
    anio_hasta date
);
