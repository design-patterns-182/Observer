package br.com.studiotrek;

public class Main {

	public static void main(String[] args) {		
		Acao acao = new Acao("PRESUNTO10", 15.12);
		
		Supermercado supermercado = new Supermercado();
		acao.registrarNotificacao(supermercado);
		acao.setValor(55.12);
	}
	
}
