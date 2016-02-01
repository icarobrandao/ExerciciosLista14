package Exercicio02;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Produto almoco = new Refeicao(TipoProdutoEnum.ALMOCO,12.0);
		
		Produto marmita = new Refeicao(TipoProdutoEnum.MARMITA,10.0);
		
		Produto suco = new Bebida(TipoProdutoEnum.SUCO, 5.0);
		
		Produto refrigerante = new Bebida(TipoProdutoEnum.REFRIGERANTE, 6.0);
		
		Produto almocoPromocional = new Produto(){

			@Override
			public double getValor() {
				return 8.0;
			}

			@Override
			public TipoProdutoEnum getTipoProdutoEnum() {
				return TipoProdutoEnum.ALMOCO;
			}
			
		};
		
		
		
		
	}

}
