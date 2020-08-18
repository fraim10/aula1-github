package entidade;

public class Produto {

	private String nome;
	private double pre�o;
	private int qtd;
	
	public Produto() {
		
	}
	
	public Produto(String nome, double pre�o, int qtd) {
		this.nome = nome;
		this.pre�o=pre�o;
		this.qtd=qtd;
	}
	public Produto(String nome, double pre�o) {
		this.nome = nome;
		this.pre�o=pre�o;		
	}
	
	public int getQtd() {
		return qtd;
	}
	
	public Double getPre�o() {
		return pre�o;
	}
	public void setPre�o(double pre�o) {
		this.pre�o=pre�o;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double soma() {
		return pre�o*qtd;
	}
	
	public void adcprod(int qtd) {
		this.qtd += qtd;
	}
	
	public void rmvprod(int qtd) {
		this.qtd-=qtd;
	}
	
	public String toString() {
		return nome+", $ "+String.format("%.2f", pre�o)+", "+qtd+" unidades, Total: R$ "+String.format("%.2f", soma());
	}
}
