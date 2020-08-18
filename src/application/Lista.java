package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {
		//adicionar
		List <String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		
		for (String x : list) {
			System.out.println(x);
		}		
		//inserir
		System.out.println("-------------------");
		list.add(2,"Marcos");
		for (String x : list) {
			System.out.println(x);
		}		
		//tamanho
		System.out.println("-------------------");
		System.out.println(list.size());
		
		//remover
		System.out.println("-------------------");
		list.remove("Ana");
		list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'B');
		for (String x : list) {
			System.out.println(x);
		}
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		
		//encontrar a posição de um elemento
		System.out.println("-------------------");
		System.out.println("Index of Bob: "+list.indexOf("Maria"));
		System.out.println("Index of Bob: "+list.indexOf("Ana"));
		String nome = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
		System.out.println(nome);
	}

}
