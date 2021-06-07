package com.marcoaq7.model;

public class Log  implements Notificador {

	@Override
	public void notificar(Mensagem mensagem) {
		System.out.println("Mensagem para log: " + mensagem);
	}

}
