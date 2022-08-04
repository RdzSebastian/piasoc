
package com.estonianport.piasoc.commons.emailService;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.estonianport.piasoc.commons.dateUtil.DateUtil;
import com.estonianport.piasoc.model.Cliente;
import com.estonianport.piasoc.model.Cotizacion;
import com.estonianport.piasoc.model.DatosVehiculo;
import com.estonianport.piasoc.model.Modelo;

@Service
public class EmailService{

	private static final Logger LOGGER = LoggerFactory.getLogger(EmailService.class);

	@Autowired
	private JavaMailSender sender;

	public void sendEmail(Email emailBody)  {
		sendEmailTool(emailBody.getContent(), emailBody.getEmail(), emailBody.getSubject());
	}

	private void sendEmailTool(String textMessage, String email, String subject) {
		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);

		try {
			helper.setTo(email);
			helper.setText(textMessage, true);
			helper.setSubject(subject);
			sender.send(message);
		} catch (MessagingException e) {
			LOGGER.error("Hubo un error al enviar el mail: ", e);
		}
	}
	
	public void enviarMailComprabanteCliente(Cotizacion cotizacion) {

		Email emailBody = new Email();
		
		Modelo modelo = cotizacion.getDatosVehiculo().getModelo();
		Cliente cliente = cotizacion.getCliente();
		
		emailBody.setEmail("estonianport@gmail.com");
		emailBody.setSubject("Solicitud de cotizacion de seguro");
		emailBody.setContent(
				"Buenos dias " + cliente.getApellido() + ", " + cliente.getNombre() + "<br>" +
				"Su " + modelo.getTipoVehiculo().getNombre() + ": " + modelo.getMarca().getNombre()+ ", " + modelo.getNombre() + " ha sido procesado exitosamente." + "<br>" +
				"Nuestros asesores procederan a enviarle la tasacion del seguro lo antes posible." + "<br>" +
				"Muchisimas gracias por utilizar nuestros servicios.");

		// Envio al cliente
		this.sendEmail(emailBody);

		//Envio a mail de la empresa
		emailBody.setEmail(cotizacion.getCliente().getEmail());
		this.sendEmail(emailBody);

	}
	
	public void enviarMailComprabanteAseguradora(Cotizacion cotizacion) {

		Email emailBody = new Email();

		Modelo modelo = cotizacion.getDatosVehiculo().getModelo();
		Cliente cliente = cotizacion.getCliente();
		DatosVehiculo datosVehiculo = cotizacion.getDatosVehiculo();

		emailBody.setEmail("estonianport@gmail.com");
		emailBody.setSubject("Nueva consulta de " + cliente.getApellido() + ", " + cliente.getNombre());
		emailBody.setContent(
				"El cliente " + cliente.getApellido() + ", " + cliente.getNombre() + "<br>" +
				"Quiere realizar una consulta de cotizacion" + "<br> <br>" +
				"Vehiculo:" + "<br>" +
				modelo.getTipoVehiculo().getNombre() + ": " + modelo.getMarca().getNombre()+ ", " + modelo.getNombre() + "<br>" +
				"<br>" +
				"Datos del Vehiculo:" + "<br>" +
				"Intervalo de edad: " + datosVehiculo.getIntervaloEdad().getIntervalo() + "<br>" +
				"Intervalo de Kilometros: " + datosVehiculo.getIntervaloKilometros().getIntervalo() + "<br>" +
				"Tiene alarma: " + (datosVehiculo.isAlarma() ? "Si" : "No") + "<br>" +
				"Se guarda en garage: " + (datosVehiculo.isGarage() ? "Si" : "No") + "<br>" +
				"Es de uso particular: " + (datosVehiculo.isParticular() ? "Si" : "No") + "<br>" +
				"Maneja el auto un menor de 25 años: " + (datosVehiculo.isHijos() ? "Si" : "No") + "<br>" +
				"<br>" +
				"Datos del cliente:" + "<br>" +
				"Direccion: " + cliente.getCiudad() + ", " + cliente.getProvincia() + "<br>" +
				"Codigo Postal: " + cliente.getCodigoPostal() + "<br>" +
				"Cuil: " + cliente.getCuil() + "<br>" +
				"Email: " + cliente.getEmail() + "<br>" +
				"Fecha de nacimiento: " + DateUtil.getFecha(cliente.getFechaNacimiento()) + "<br>" +
				"Sexo: " + cliente.getSexo().getNombre() + "<br>" +
				"Empresa: " + (cliente.getEmpresa() != null && cliente.getEmpresa().isEmpty() ? cliente.getEmpresa() : "-") + "<br>" +
				"Comentarios: " + (cliente.getComentarios() != null && cliente.getComentarios().isEmpty()  ? cliente.getComentarios() : "-") + "<br>");

		// Envio al cliente
		this.sendEmail(emailBody);

		//Envio a mail de la empresa
		emailBody.setEmail("estonianport@gmail.com");
		this.sendEmail(emailBody);

	}

}