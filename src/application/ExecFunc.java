package application;

import java.util.Scanner;

import entidade.Func;

public class ExecFunc {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		Func f = new Func();
		
		System.out.print("Digite o nome: ");
		f.nome = sc.nextLine();
		System.out.print("Digite o salário bruto: ");
		f.sb = sc.nextDouble();
		System.out.print("Digite o imposto: ");
		f.imp = sc.nextDouble();
		
		System.out.println(f);
		
		System.out.print("Digite a porcentagem para subir salário: ");
		double porc = sc.nextDouble();
		f.aumento(porc);
		
		System.out.println(f);
		
		sc.close();
	}

}
