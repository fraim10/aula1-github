package entidade;

public class Func {

	public String nome;
	public double sb;
	public double imp;
	
	public double sl () {
		return sb-imp;
	}
	
	public void aumento(double porc) {
		sb += sb * porc/100;
	}
	
	public String toString() {
		return "Empregado: "+nome+" R$ "+String.format("%.2f", sl());
	}
}
