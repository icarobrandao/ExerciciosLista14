package Exercicio01;

public class ArquivadorImpl implements Arquivador {

	@Override
	public boolean procuraCaracter(char c) {
		System.out.println("Procurando por character: "+c+"...");
		return false;
	}

	@Override
	public String lerLinha() {
		System.out.println("Lendo linha...");
		return null;
		
	}

	@Override
	public void lerArquivo(String caminhoArquivo) {
		System.out.println("Lendo Arquivo: "+caminhoArquivo+"...");
	}

	@Override
	public void gravar(String caminhoArquivo) {
		System.out.println("Gravando Arquivo "+caminhoArquivo);
	}

}
