$(document).ready(function() {

	$("#tipoVehiculo").change(function(){

		data = {
			tipoVehiculoId: $("#tipoVehiculo").val()
		};
		
		$.ajax({
			type: 'GET',
			url: "http://localhost:8080/api/buscarMarca",
			data : data,
			contentType: "application/json",
			success : function(listaMarca) {
				
				// Borra la vieja lista de marcas
				$('#marca option').remove()
				
				listaMarca.forEach(function(marca) {
					addOptionOnSelect("marca", marca.nombre, marca.id)
				});
				
				addHiddenFirstOptionOnSelect("marca", "Seleccione marca");
				addHiddenFirstOptionOnSelect("modelo", "Seleccione modelo");
			}
		});
	});
	
	$("#marca").change(function(){

		data = {
			tipoVehiculoId: $("#tipoVehiculo").val(),
			marcaId: $("#marca").val()
		};
		
		$.ajax({
			type: 'GET',
			url: "http://localhost:8080/api/buscarModelo",
			data : data,
			contentType: "application/json",
			success : function(listaModelo) {
				
				// Borra la vieja lista de modelos
				$('#modelo option').remove()
				
				listaModelo.forEach(function(modelo) {
					addOptionOnSelect("modelo", modelo.nombre, modelo.id)
				});
				
				addHiddenFirstOptionOnSelect("modelo", "Seleccione modelo");

			}
		});
	});

	
	function addOptionOnSelect(elemento, valor, id) {
	  var x = document.getElementById(elemento);
	  var option = document.createElement("option");
	  option.id = id;
	  option.value = id;
	  option.text = valor;
	  x.add(option);
	}
	
	function addHiddenFirstOptionOnSelect(elemento, valor) {
	  var x = document.getElementById(elemento);
	  var option = document.createElement("option");
	  option.value = valor;
	  option.text = valor;
	  option.defaultSelected = true
	  option.hidden = true
	  x.add(option);
	}

});