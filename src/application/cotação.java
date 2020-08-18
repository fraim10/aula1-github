package application;

import java.util.Scanner;

public class cotação {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.printf("Preço do dolar: ");
		entidade.cotação.Dolar = sc.nextDouble();
		System.out.printf("Quantos dolares quer comprar: ");
		entidade.cotação.qtd = sc.nextDouble();
		
		System.out.printf("Quantidade a ser paga :%.2f",entidade.cotação.compra());
		
		sc.close();

	}

}
