package ExercicioFinal;

public class Visualizacao {
	private Gafanhoto espectador;
	private Video Filme;
	
	public Visualizacao(Gafanhoto espectador, Video filme) {
		super();
		this.espectador = espectador;
		Filme = filme;
		this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
		this.Filme.setViews(this.Filme.getViews()+1);
	}

	public Gafanhoto getEspectador() {
		return espectador;
	}

	public void setEspectador(Gafanhoto espectador) {
		this.espectador = espectador;
	}

	public Video getFilme() {
		return Filme;
	}

	public void setFilme(Video filme) {
		Filme = filme;
	}

	@Override
	public String toString() {
		return "Visualizacao [espectador=" + espectador + ", Filme=" + Filme + "]";
	}
	
		public void avaliar(){
			this.Filme.setAvaliacao(5);
			
		}
		
		public void avaliar(int nota){
			this.Filme.setAvaliacao(nota);
			
		}
	
			public void avaliar(float porc){
				int tot = 0;
				if(tot <=20){
					tot = 3;
				}else {
					if(porc <=50){
						tot = 5;
						
					}else {
						if(porc <=90)
							tot = 10; 
					}    
					
					
				}
				
			}
	
	
	

}
