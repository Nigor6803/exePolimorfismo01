package entidade;

public class Produto {
	
	private String nome;
	private Double preco;
	
	public Produto() {
		}
	
	public Produto(String nome,Double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void getPreco(double preco) {
		this.preco = preco;
	}
	
	public String etiquetaDePreco() {
		return nome + " - $"+ String.format("%.2f",preco);
	}
}
