
package com.estonianport.piasoc.email;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.estonianport.piasoc.model.Cotizacion;
import com.estonianport.piasoc.model.Modelo;

@Service
public class EmailService implements EmailPort{

	private static final Logger LOGGER = LoggerFactory.getLogger(EmailService.class);

	@Autowired
	private JavaMailSender sender;

	@Override
	public void sendEmail(EmailBody emailBody)  {
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
	
	@Override
	public void enviarMailComprabanteReserva(Cotizacion cotizacion) {

		EmailBody emailBody = new EmailBody();
		emailBody.setEmail("estonianport@gmail.com");
		emailBody.setSubject("Solicitud de cotizacion de seguro");
		
		Modelo modelo = cotizacion.getDatosVehiculo().getModelo();
		emailBody.setContent(
				"Buenos dias " + cotizacion.getCliente().getApellido() + ", " + cotizacion.getCliente().getNombre() + "<br>" +
				"Su " + modelo.getTipoVehiculo().getNombre() + ": " + modelo.getNombre() + ", " +  modelo.getMarca().getNombre() + " ha sido procesado exitosamente." + "<br>" +
				"Nuestros asesores procederan a enviarle la tasacion del seguro lo antes posible." + "<br>" +
				"Muchisimas gracias por utilizar nuestros servicios.");

		// Envio al cliente
		this.sendEmail(emailBody);

		//Envio a mail de la empresa
		emailBody.setEmail("rdzsebastian@gmail.com");
		this.sendEmail(emailBody);

		
	}

}