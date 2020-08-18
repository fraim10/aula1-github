package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Lista;

public class ExecLista {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List <Lista> l = new ArrayList<>();
		
		int n;
		n = sc.nextInt();
		
		for (int i=0;i<n;i++) {
			System.out.println();
			int id = sc.nextInt();			
			sc.nextLine();
			while (temID(l, id)) {
				System.out.println("Id duplicado, tente de novo: ");
				id = sc.nextInt();
			}
			String func = sc.nextLine();
			double sal = sc.nextDouble();
			Lista lis = new Lista(id, sal, func);
			l.add(lis);
		}
		
		System.out.println("Id do sortudo: ");
		int idsal = sc.nextInt();
		Lista lis = l.stream().filter(x -> x.getId() == idsal).findFirst().orElse(null);
		if (lis == null) {
			System.out.println("Id não encontrado");
		}
		else {
		System.out.println("Digite a porcentagem: ");
		double porc = sc.nextDouble();
		lis.porc(porc);
		}
		System.out.println();
		System.out.println("Lista de funcionários: ");
		for (Lista list : l) {
			System.out.println(list);
		}
		sc.close();
	}
	public static boolean temID(List<Lista> list, int id) {
		Lista l = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return l != null;
	}
}
