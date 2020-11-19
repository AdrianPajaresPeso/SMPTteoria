package org.jesuitasrioja.SMPTteoria.logica;

import java.io.IOException;

import org.apache.commons.net.smtp.SMTPClient;

public class EnvioCorreos {

	public static void enviarCorreo(String destinatario, String msg) {
		SMTPClient cliente = new SMTPClient();
		
		try {
			Integer respuesta;
			cliente.connect("");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
