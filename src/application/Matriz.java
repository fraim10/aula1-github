package application;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Integer n1 = sc.nextInt();
		Integer n2[][] = new Integer[n1][n1];
		Integer n3=0;
		
		for (int i=0; i<n2.length; i++) {
			for (int x=0; x<n2[i].length;x++) {
				n2[i][x] = sc.nextInt();
				if (n2[i][x]<0) {
					n3++;
				}
			}
		}
		
		System.out.println("Diagonal: ");
		for (int i=0;i<n2.length;i++) {
			System.out.printf(n2[i][i] + " ");
		}
		System.out.println();
		System.out.printf("Quantidade de numeros negativos: "+n3);
		
		
		
		sc.close();

	}

}
