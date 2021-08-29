CREATE table VEHICULO
(
    id serial NOT null PRIMARY KEY,
    marca character varying(20),
    modelo_id INT references modelo, 
    tipo varchar (20)
);
ALTER TABLE public.vehiculo ALTER COLUMN marca SET NOT NULL;
ALTER TABLE public.vehiculo ALTER COLUMN modelo_id SET NOT NULL;
ALTER TABLE public.vehiculo ALTER COLUMN tipo SET NOT NULL;
