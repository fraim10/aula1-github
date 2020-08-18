package entidade;

public class Produto {

	private String nome;
	private double preço;
	private int qtd;
	
	public Produto() {
		
	}
	
	public Produto(String nome, double preço, int qtd) {
		this.nome = nome;
		this.preço=preço;
		this.qtd=qtd;
	}
	public Produto(String nome, double preço) {
		this.nome = nome;
		this.preço=preço;		
	}
	
	public int getQtd() {
		return qtd;
	}
	
	public Double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço=preço;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double soma() {
		return preço*qtd;
	}
	
	public void adcprod(int qtd) {
		this.qtd += qtd;
	}
	
	public void rmvprod(int qtd) {
		this.qtd-=qtd;
	}
	
	public String toString() {
		return nome+", $ "+String.format("%.2f", preço)+", "+qtd+" unidades, Total: R$ "+String.format("%.2f", soma());
	}
}
