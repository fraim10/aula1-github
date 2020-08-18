package application;

import java.util.Scanner;

public class ExecMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Integer m = sc.nextInt();
		Integer n = sc.nextInt();
		Integer matriz[][] = new Integer [m][n];
		
		for (int i=0; i<matriz.length; i++) {
			System.out.println();
			for (int j=0; j<matriz[i].length;j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		for (int i=0; i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				if (x == matriz[i][j]) {
					System.out.println();
					System.out.printf("Posição: "+i+","+j);
					if (j > 0) {
						System.out.println("Esquerda: " + matriz[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Cima: " + matriz[i-1][j]);
					}
					if (j < matriz[i].length-1) {
						System.out.println("Direita: " + matriz[i][j+1]);
					}
					if (i < matriz.length-1) {
						System.out.println("Abaixo: " + matriz[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}
}
