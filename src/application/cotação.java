package application;

import java.util.Scanner;

public class cota��o {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.printf("Pre�o do dolar: ");
		entidade.cota��o.Dolar = sc.nextDouble();
		System.out.printf("Quantos dolares quer comprar: ");
		entidade.cota��o.qtd = sc.nextDouble();
		
		System.out.printf("Quantidade a ser paga :%.2f",entidade.cota��o.compra());
		
		sc.close();

	}

}
