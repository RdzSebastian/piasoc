alter table VEHICULO add modelo_id INT;
 
update  vehiculo set modelo_id = modelo.id 
from modelo 
where vehiculo.modelo_id = modelo.id;

alter table vehiculo drop column modelo;

alter table vehiculo add constraint fk_vehiculo_modelo foreign key (modelo_id) references modelo;