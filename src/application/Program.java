package application;

import java.util.Scanner;

import entidade.Triangulo;


public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Triangulo x,y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();		
		
		double areaY = y.area();
		
		System.out.printf("Triangulo X: %.4f%n",areaX);
		System.out.printf("Triangulo Y: %.4f%n",areaY);
		
		if (areaX > areaY) {
			System.out.println("Area X maior");
		}else 
			System.out.println("Area Y maior");
		
		sc.close();

	}

}
