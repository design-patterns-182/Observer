package br.com.studiotrek;

import java.util.HashSet;
import java.util.Set;

public class Acao {

	private String codigo;
	private Double valor;
	public Set<AcaoObserver> notificar = new HashSet<AcaoObserver>();
	
	public Acao(String codigo, Double valor) {
		this.codigo = codigo;
		this.valor = valor;
	}
	
	public void registrarNotificacao(AcaoObserver interessado) {
		this.notificar.add(interessado);
	}
	
	public void cancelarNotificacao(AcaoObserver interessado) {
		this.notificar.remove(interessado);
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
		for (AcaoObserver acaoObserver : notificar) {
			acaoObserver.notificar(this);
		}
	}

	public String getCodigo() {
		return codigo;
	}

}
