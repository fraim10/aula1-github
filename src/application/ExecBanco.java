package application;
import java.util.Scanner;

import entidade.Banco;

public class ExecBanco {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		Banco b;			
		
		System.out.println("Digite o numero da conta: ");
		int nc = sc.nextInt();
		System.out.println("Digite o nome da pessoa: ");
		String nome = sc.next();			
		System.out.println("Irá fazer depósito inicial (S/N): ");
		char escolha = sc.next().charAt(0);
		if (escolha=='s') {
			System.out.println("Digite o valor: ");
			double DI = sc.nextDouble();		
			b=new Banco(nc, nome, DI);
		}else {			
			b=new Banco(nc, nome);
		}
		
		System.out.println();
		System.out.println("Conta:");
		System.out.println(b);		
		
		System.out.println();
		System.out.println("Digite o valor do deposito: ");
		double dep = sc.nextDouble();
		b.dep(dep);
		
		System.out.println();
		System.out.println("Conta:");
		System.out.println(b);
		
		System.out.println();
		System.out.println("Digite o valor da retirada: ");
		double ret = sc.nextDouble();
		b.ret(ret);
		
		System.out.println();
		System.out.println("Conta:");
		System.out.println(b);
		
		sc.close();
	}

}
