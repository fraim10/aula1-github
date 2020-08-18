package entidade;

public class Triangulo {

	

		public double a,b,c;
		
		public double area() {
			double p=(a+b+c)/2.0;
			double e= Math.sqrt(p*(p-a)*(p-b)*(p-c));
			return e;
		}
		
	

}
