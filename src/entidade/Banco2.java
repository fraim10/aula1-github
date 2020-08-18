package entidade;

public class Banco2 {
	private int conta;
	private String nome;
	private double saldo;
	public Banco2(int conta, String nome) {
		super();
		this.conta = conta;
		this.nome = nome;
	}
	public Banco2(int conta, String nome, double di) {
		super();
		this.conta = conta;
		this.nome = nome;
		this.saldo = di;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getConta() {
		return conta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void calcDI (double di) {
		saldo =+ di;
	}
	public void calcDep (double dep) {
		saldo += dep;
	}
	public void calcRet (double ret) {
		saldo -= ret + 5;
	}
	@Override
	public String toString() {
		return "Conta: " + conta + ", Nome: " + nome + ", Saldo: " + String.format("%.2f", saldo) ;
	}
	
}


