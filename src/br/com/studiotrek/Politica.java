package br.com.studiotrek;

public class Politica extends Noticia {

	@Override
	public void publicarArtigo() throws Exception {
		for (NotificaObserver notificaObserver : notificar) {
			notificaObserver.notificar(this);
		}
	}

}
