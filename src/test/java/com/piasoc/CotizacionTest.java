package com.piasoc;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.estonianport.piasoc.model.Cliente;
import com.estonianport.piasoc.model.Cotizacion;
import com.estonianport.piasoc.model.DatosVehiculo;
import com.estonianport.piasoc.model.IntervaloEdad;
import com.estonianport.piasoc.model.IntervaloKilometros;
import com.estonianport.piasoc.model.Modelo;
import com.estonianport.piasoc.model.Sexo;
import com.estonianport.piasoc.service.ClienteService;
import com.estonianport.piasoc.service.CotizacionService;
import com.estonianport.piasoc.service.DatosVehiculoService;
import com.estonianport.piasoc.service.IntervaloEdadService;
import com.estonianport.piasoc.service.IntervaloKilometrosService;
import com.estonianport.piasoc.service.ModeloService;
import com.estonianport.piasoc.service.SexoService;


@SpringBootTest
class CotizacionTest {

	@Autowired
	private CotizacionService cotizacionService;

	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private DatosVehiculoService datosVehiculoService;

	@Autowired
	private IntervaloKilometrosService intervaloKilometrosService;

	@Autowired
	private IntervaloEdadService intervaloEdadService;

	@Autowired
	private ModeloService modeloService;

	@Autowired
	private SexoService SexoService;

	@Test
	void testEventoConExtras() {
		Cotizacion cotizacion = new Cotizacion();

		DatosVehiculo datosVehiculo = new DatosVehiculo();

		datosVehiculo.setAlarma(true);
		datosVehiculo.setGarage(false);
		datosVehiculo.setHijos(true);
		datosVehiculo.setParticular(true);

		List<Modelo> listaModelo = modeloService.getAll();
		datosVehiculo.setModelo(listaModelo.get(1));

		List<IntervaloKilometros> ListaIntervaloKilometros = intervaloKilometrosService.getAll();
		datosVehiculo.setIntervaloKilometros(ListaIntervaloKilometros.get(1));

		List<IntervaloEdad> ListaIntervaloEdad = intervaloEdadService.getAll();
		datosVehiculo.setIntervaloEdad(ListaIntervaloEdad.get(1));

		datosVehiculoService.save(datosVehiculo);
		cotizacion.setDatosVehiculo(datosVehiculo);

		Cliente cliente = new Cliente();
		cliente.setNombre("Juan");
		cliente.setApellido("Rodriguez");
		cliente.setEmpresa(null);
		cliente.setCiudad("San Martin");
		cliente.setProvincia("Buenos Aires");
		cliente.setCodigoPostal(1650);
		cliente.setEmail("a@gmail.com");
		cliente.setCelular(1511551155);
		cliente.setComentarios(null);

		List<Sexo> listaSexo = SexoService.getAll();
		cliente.setSexo(listaSexo.get(1));

		clienteService.save(cliente);
		cotizacion.setCliente(cliente);
		
		cotizacionService.save(cotizacion);

	}

}
