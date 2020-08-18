package entidade;

public class cotação {

	public static double Dolar;
	public static double qtd;
	public static final double IOF = 0.06;
	
	public static double compra () {
		return Dolar*qtd+(Dolar*qtd*IOF);
	}
}
