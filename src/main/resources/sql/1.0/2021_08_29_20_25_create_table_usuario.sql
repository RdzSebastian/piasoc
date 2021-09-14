CREATE table USUARIO
(
    id serial NOT null PRIMARY KEY,
    usuario character varying(20) NOT null,
    nombre character varying(20) NOT null,
    habilitado bool NOT null
);