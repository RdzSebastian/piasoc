$(document).ready(function () {
	
	    
    var allMarcas = $('#marca option')
    $('#tipoVehiculo').change(function () {
        $('#marca option').remove()
        var classTipoVehiculo = $('#tipoVehiculo option:selected').prop('class');
        var opts = allMarcas.filter('.' + classTipoVehiculo);
        $.each(opts, function (i, j) {
            $(j).appendTo('#marca');
        });
        
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


});