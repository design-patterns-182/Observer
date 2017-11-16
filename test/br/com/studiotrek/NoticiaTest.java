package br.com.studiotrek;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class NoticiaTest {

	@Test
	public void escreverArtigoTest() {
		try {
			Noticia noticia = new Esporte();
			noticia.escreverArtigo("A", "S");
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}
	
}
