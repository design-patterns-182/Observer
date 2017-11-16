package br.com.studiotrek;

public class Esporte extends Noticia {
	
	@Override
	public void publicarArtigo() throws Exception {
		for (NotificaObserver notificaObserver : notificar) {
			notificaObserver.notificar(this);
		}
	}
	
}
