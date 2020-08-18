package application;

import java.util.Scanner;

import entidade.Produto;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entrada de produto");
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("Preço: ");
		double preço = sc.nextDouble();
		
		
		Produto p = new Produto(nome, preço);
		
		p.setNome("PC");
		System.out.println("Atualização: "+p.getNome());
		p.setPreço(1200.00);
		System.out.println("Atualização: "+p.getPreço());		
		System.out.println(p);

		System.out.println("Digite a quantidade de produto para adicionar: ");
		int qtd = sc.nextInt();
		p.adcprod(qtd);

		System.out.println(p);

		System.out.println("Digite a quantidade de produto para remover: ");
		qtd = sc.nextInt();
		p.rmvprod(qtd);

		System.out.println(p);

		sc.close();

	}

}
