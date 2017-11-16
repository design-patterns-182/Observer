package br.com.studiotrek;

public class Supermercado implements AcaoObserver {

	@Override
	public void notificar(Acao acao) {
		System.out.println("Produto " + acao.getCodigo() + " teve seu valor alterado para " + acao.getValor());
	}

}
