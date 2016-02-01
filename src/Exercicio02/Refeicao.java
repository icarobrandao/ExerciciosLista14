package Exercicio02;

public class Refeicao implements Produto{
	private double valor;
	private	TipoProdutoEnum tipoProdutoEnum;
	
	public Refeicao(TipoProdutoEnum tipoProdutoEnum, double valor) {
		setTipoProdutoEnum(tipoProdutoEnum);
		setValor(valor);
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public TipoProdutoEnum getTipoProdutoEnum() {
		return tipoProdutoEnum;
	}
	public void setTipoProdutoEnum(TipoProdutoEnum tipoProdutoEnum) {
		this.tipoProdutoEnum = tipoProdutoEnum;
	}


	
	
	


}
