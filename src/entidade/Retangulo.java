package entidade;

public class Retangulo {

	public double largura;
	public double altura;
	
	public double area () {
		return largura*altura;
	}
	
	public double peri() {
		return 2*(largura+altura);
	}
	public double diag () {
		return Math.sqrt(altura*largura+altura*largura);
	}
}
