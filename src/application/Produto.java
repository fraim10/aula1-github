package application;

import java.util.Scanner;

import entidade.Produto2;

public class Produto {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		Produto2[] p = new Produto2[n];
		
		for (int i=0; i<p.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double pre�o = sc.nextDouble();
			p[i] = new Produto2(nome, pre�o);
		}
		double soma = 0;
		
		for (int i=0; i<p.length ; i++) {
			soma+= p[i].getPre�o();
		}
		double media = soma/p.length;
		System.out.printf("Media de pre�o R$: %.2f%n",media);
	}

}
