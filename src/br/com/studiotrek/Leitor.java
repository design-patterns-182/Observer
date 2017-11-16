package br.com.studiotrek;

public class Leitor implements NotificaObserver {

	private String nome;

	public Leitor(String nome) throws Exception {
		
		if (nome.length() > 0) {
			this.nome = nome;
		} else {
			throw new Exception("Nome inválido, por favor adicionar um nome");
		}
	}

	@Override
	public void notificar(Noticia noticia) throws Exception {
		try {
			
			if(noticia.retornarArtigo() != null) {
				StringBuilder sb = new StringBuilder();

				sb.append("Notificações do " + this.nome);
				sb.append('\n');
				sb.append(noticia.retornarArtigo());

				System.out.println(sb.toString() + '\n');	
			} else {
				throw new Exception("Artigo inválido, necessario adicionar um artigo");
			}
			
		} catch (Exception e) {
			throw e;
		}
		
	}

}
