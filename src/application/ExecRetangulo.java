package application;

import java.util.Scanner;

import entidade.Retangulo;

public class ExecRetangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Retangulo r = new Retangulo();
		
		System.out.print("Digite a altura do retangulo: ");
		r.altura = sc.nextDouble();
		System.out.print("Digite a largura do retangulo: ");
		r.largura = sc.nextDouble();
		
		System.out.printf("Área: %.2f",r.area());
		System.out.printf("Perímetro: %.2f",r.peri());
		System.out.printf("Diagonal: %.2f",r.diag());
		
		sc.close();

	}

}
