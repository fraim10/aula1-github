package application;

import java.util.Scanner;

import entidade.Pensionato;

public class ExecPensionato {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);		
		
		Pensionato p[] = new Pensionato[10];
		
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {		
			sc.nextLine();
			String est = sc.nextLine();
			String email = sc.nextLine();			
			int quarto = sc.nextInt();			
			p[quarto] = new Pensionato(est, email);		
		}
		for (int i=0; i<10 ;i++) {
			if (p[i]!=null) {
			System.out.println(i+": "+p[i]);			
			}
		}
	
		
		sc.close();
	}

}
