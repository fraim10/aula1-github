package entidade;

public class Pensionato {	
	private String est;
	private String email;
	public Pensionato(String est, String email) {		
		this.est = est;
		this.email = email;
	}
	public String getEst() {
		return est;
	}
	public void setEst(String est) {
		this.est = est;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return est + ", " + email ;
	}	
	
}
