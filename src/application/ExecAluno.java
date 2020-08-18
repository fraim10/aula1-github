package application;

import java.util.Scanner;

import entidade.Aluno;

public class ExecAluno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Aluno a = new Aluno();
		
		System.out.print("Digite o nome do aluno: ");
		a.nome = sc.nextLine();
		System.out.println("Digite as 3 notas do aluno: ");
		a.n1 = sc.nextDouble();
		a.n2 = sc.nextDouble();
		a.n3 = sc.nextDouble();
		
		a.media();
		
		if (a.media()<60) {
			System.out.println("Nota final: "+a.media());
			System.out.println("Falhou");
			System.out.println("Faltou "+a.f()+(" pontos"));
		}else {
			System.out.println("Nota final: "+a.media());
			System.out.println("Passou");
		}
		sc.close();
	}

}
