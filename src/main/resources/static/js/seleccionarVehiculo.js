$(document).ready(function () {
	
	    
    var allMarcas = $('#marca option')
    $('#tipoVehiculo').change(function () {
        $('#marca option').remove()
        var classTipoVehiculo = $('#tipoVehiculo option:selected').prop('class');
        var opts = allMarcas.filter('.' + classTipoVehiculo);
        $.each(opts, function (i, j) {
            $(j).appendTo('#marca');
        });
        
        addHiddenFirstOptionOnSelect("marca", "Seleccione marca");
        addHiddenFirstOptionOnSelect("modelo", "Seleccione modelo");

		var optionMarca =[];
		$('#marca option').each(function(){
		   if($.inArray(this.value, optionMarca) >-1){
		      $(this).remove()
		   }else{
		      optionMarca.push(this.value);
		   }
		});
    });
    
    var allModelos = $('#modelo option')
    $('#marca').change(function () {
        $('#modelo option').remove()
        var classMarca = $('#marca option:selected').prop('class');
        var marcaTipoVehiculo = classMarca.replace(/ /g,".");
        var opts = allModelos.filter('.' + marcaTipoVehiculo);
        $.each(opts, function (i, j) {
            $(j).appendTo('#modelo');
        });
        
        addHiddenFirstOptionOnSelect("modelo", "Seleccione modelo");

    });
    
    const options = []

	var optionValues =[];
	$('#tipoVehiculo option').each(function(){
	   if($.inArray(this.value, optionValues) >-1){
	      $(this).remove()
	   }else{
	      optionValues.push(this.value);
	   }
	});


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