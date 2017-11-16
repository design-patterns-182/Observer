package br.com.studiotrek;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			Leitor carlos = new Leitor("Carlos");
			Leitor aurelio = new Leitor("Aurelio");
			
			Esporte esporte = new Esporte();
			Economia economia = new Economia();
			Politica politica = new Politica();
			
			esporte.registarInteressado(carlos);
			economia.registarInteressado(carlos);
			
			esporte.registarInteressado(aurelio);
			politica.registarInteressado(aurelio);
			
			esporte.escreverArtigo("Antonio", "Formula 1 acontece no Brasil nesse domingo");
			esporte.publicarArtigo();
			
			economia.escreverArtigo("Flavio", "N�mero de desemprego cai no Brasil");
			economia.publicarArtigo();
			
			politica.escreverArtigo("Ana", "Senado aprova mudan�a nas leis do trabalho");
			politica.publicarArtigo();
			
		} catch (Exception e) {
			System.out.println("N�o foi possivel executar a aplica��o: " + e.getMessage());
		}
		
		
	}
	
}
