package entidade;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	Integer id;
	Double sal;
	String func;
	List <String> list = new ArrayList<>();
	
	public Lista() {
		super();
	}

	public Lista(Integer id, Double sal, String func) {
		super();
		this.id = id;
		this.sal = sal;
		this.func = func;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFunc() {
		return func;
	}

	public void setFunc(String func) {
		this.func = func;
	}

	public Double getSal() {
		return sal;
	}
	public void porc (double porc) {
		sal += sal*porc/100;
	}
	public String toString() {
		return id + ", " + func + ", " + String.format("%.2f", sal);
	}
	
}
