package Exercicio01;

public interface Arquivador {

	public boolean procuraCaracter (char c);
	
	public String lerLinha();
	
	public void lerArquivo(String caminhoArquivo);
	
	public void gravar(String caminhoArquivo);
	
}
