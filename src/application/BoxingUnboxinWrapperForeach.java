package application;

public class BoxingUnboxinWrapperForeach {

	public static void main(String[] args) {
		//boxing
		int x = 20;
		Object obj = x;
		System.out.println(obj);
		
		//unboxing
		int y = (int) obj;		
		System.out.println(y);
		
		//wrapper
		int a = 20;
		Integer ob = a;
		int b = ob*2;
		System.out.println(b);
		
		//For each
		String vetor[] = new String[] {"Maria","Bob","Alex"};		
		
		for (int i=0; i<vetor.length;i++) {
			System.out.println(vetor[i]);			
		}
		System.out.println("------------------------------");		
		for (String objeto : vetor) {
			System.out.println(objeto);
		}
	}

}
