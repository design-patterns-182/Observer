package br.com.studiotrek;

import org.junit.Assert;
import org.junit.Test;

public class LeitorTest {

	@Test
	public void verificaNotificacao() {
		try {
			Leitor leitor = new Leitor("Arthur");
			
			Noticia noticia = new Esporte();
			noticia.registarInteressado(leitor);
			
			noticia.escreverArtigo("Augusto", "McLaren é campeã de Formula 1.");
			noticia.publicarArtigo();
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}
	
}
