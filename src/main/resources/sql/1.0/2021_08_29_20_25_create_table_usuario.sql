CREATE table USUARIO
(
    id serial NOT null PRIMARY KEY,
    usuario character varying(20) not null,
    nombre character varying(20) not null,
    habilitado bool not null
);