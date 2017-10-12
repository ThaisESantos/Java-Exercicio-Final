package ExercicioFinal;

public class Gafanhoto extends Pessoa {

	private int login;
	private int totAssistido;
	
	public Gafanhoto(String nome, int idade, String sexo, int login) {
		super(nome, idade, sexo);
		this.login = login;
		this.totAssistido = 0;
		this.experiencia = "Ainda sem experiencia";
	}
	public int getLogin() {
		
		return login;
	}
	public void setLogin(int login) {
		this.login = login;
	}
	public int getTotAssistido() {
		return totAssistido;
	}
	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}
	
	public void viuMaisUm(){
		this.totAssistido = totAssistido + 1;
		
	}
	@Override
	public String toString() {
		return "Gafanhoto [login=" + login + ", totAssistido=" + totAssistido + "]";
	}
	
	
	

}
