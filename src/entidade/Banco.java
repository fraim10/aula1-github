package entidade;

public class Banco {
	
	private int nc;
	private String nome;
	private double di;	
	private double saldo;
	private double vd;
	private double vr;
	
	public Banco() {
		super();
	}	
	public Banco(int nc, String nome) {
		super();
		this.nc = nc;
		this.nome = nome;
	}
	public Banco(int nc, String nome, double DI) {
		super();
		this.nc = nc;
		this.nome = nome;
		dep(DI);
	}
	public double getNc() {
		return nc;
	}	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void somaDI(double di) {
		saldo=+di;
	}
	public void dep(double dep) {
		saldo+=dep;
	}
	public void ret(double ret) {
		saldo-=ret+5;
	}
	@Override
	public String toString() {
		return "Conta: " + nc + ", Nome: " + nome + ", Saldo R$: " + String.format("%.2f", saldo);
	}
	
}
