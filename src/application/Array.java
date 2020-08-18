package application;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		double a[] = new double [n];
		
		
		for (int i=0 ; i<n ; i++) {
			a[i] = sc.nextDouble();
		}
		for (int x=0; x<n ;x++) {
			System.out.println(a[x]);
		}
		
		sc.close();
	}

}
