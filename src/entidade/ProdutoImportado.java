package entidade;

public class ProdutoImportado extends Produto{
	
	private Double taxaDeImportacao;
	
	public ProdutoImportado() {
		super();
	}
	
	public ProdutoImportado(String nome, Double preco, Double taxaDeImportacao) {
		super(nome,preco);
		this.taxaDeImportacao = taxaDeImportacao;
	}
	
	public Double getTaxaDeImportacao() {
		return taxaDeImportacao;
	}
	
	public void setTaxaDeImportacao(Double taxaDeImportacao) {
		this.taxaDeImportacao = taxaDeImportacao;
	}
	
	public double valorTotal() {
		return getPreco() + taxaDeImportacao;
	}
	
	@Override
	public String etiquetaDePreco() {
		return getNome()
				+" - $"
				+String.format("%.2f",valorTotal())
				+" - TAXA DE IMPORTAÇÃO:"
				+ String.format("%.2f",taxaDeImportacao);
	}
}
