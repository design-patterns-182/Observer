package br.com.studiotrek;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public abstract class Noticia {

	protected Set<NotificaObserver> notificar = new HashSet<NotificaObserver>();
	private StringBuilder artigo;

	public void registarInteressado(NotificaObserver notificaObserver) {
		this.notificar.add(notificaObserver);
	}

	public void removerInteressado(NotificaObserver notificaObserver) {
		this.notificar.remove(notificaObserver);
	}

	public void escreverArtigo(String autor, String artigo) throws Exception {

		if(autor.length() > 0 && artigo.length() > 0) {
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

			this.artigo = new StringBuilder();
			this.artigo.append("São Paulo " + formato.format(new Date()));
			this.artigo.append('\n');
			this.artigo.append("Autor: " + autor);
			this.artigo.append('\n');
			this.artigo.append(artigo);
		} else {
			throw new Exception("Autor ou Artigo inválido.");
		}
		
	}

	public String retornarArtigo() throws Exception {
		if(this.artigo != null) {
			return this.artigo.toString();	
		} else {
			throw new Exception("Artigo inválido para publicação.");
		}
	}

	public abstract void publicarArtigo() throws Exception;
}
