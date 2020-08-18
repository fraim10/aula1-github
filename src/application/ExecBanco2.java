package application;

import java.util.Scanner;

import entidade.Banco2;

public class ExecBanco2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Banco2 b;		
		
		System.out.println("Digite o numero da conta: ");
		int conta = sc.nextInt();
		System.out.println("Digite o seu nome: ");
		String nome = sc.next();
		System.out.println("Deseja ter um deposito inicial (S/N): ");
		char resp = sc.next().charAt(0);
		if (resp=='s') {
			System.out.println("Digite o valor do deposito: ");
			double di = sc.nextDouble();
			b = new Banco2(conta, nome, di);
			b.calcDI(di);			
		} else {
			b = new Banco2(conta, nome);
		}
			System.out.println("");
			System.out.println(b);
			
			System.out.println("Digite o valor para deposito: ");
			double dep = sc.nextDouble();
			b.calcDep(dep);
			System.out.println("");
			System.out.println(b);
			
			System.out.println("Digite o valor para retirada: ");
			double ret = sc.nextDouble();
			b.calcRet(ret);
			System.out.println("");
			System.out.println(b);		
			
	}

}