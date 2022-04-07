package com.estonianport.piasoc.email;

import com.estonianport.piasoc.model.Cotizacion;

public interface EmailPort {

	void sendEmail(EmailBody emailBody);

	void enviarMailComprabanteReserva(Cotizacion cotizacion);

}
