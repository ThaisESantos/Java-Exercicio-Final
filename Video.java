package ExercicioFinal;

public class Video implements AcoesVideo{
		private String titulo;
		private int avaliacao;
		private int views;
		private int curtidas;
		private boolean reproduzindo;
		
		public Video(String titulo){
			
			this.titulo = titulo;
			this.avaliacao = 1;
			this.views = 0;
			this.curtidas = 0;
			this.reproduzindo = false;
			
			
		}
		
			public String getTitulo(){
				
				return this.titulo;
			}
			
			public void setTitulo(String titulo){
				
				
			}

			public int getAvaliacao() {
				return avaliacao;
			}

			public void setAvaliacao(int avaliacao) {
				this.avaliacao = avaliacao;
			}

			public int getViews() {
				return views;
			}

			public void setViews(int views) {
				this.views = views;
			}

			public int getCurtidas() {
				return curtidas;
			}

			public void setCurtidas(int curtidas) {
				this.curtidas = curtidas;
			}

			public boolean isReproduzindo() {
				return reproduzindo;
			}

			public void setReproduzindo(boolean reproduzindo) {
				this.reproduzindo = reproduzindo;
			}

			@Override
			public void play() {
				if (this.reproduzindo==true){
					System.out.println("Video já está rodando");
				}else {
					this.reproduzindo = true;
					System.out.println("play");
				}
				
			}

			@Override
			public void pause() {
				if (this.reproduzindo==false){
					System.out.println("Já está pausado");
				}else {
					this.reproduzindo = false;
				}
				
			}

			@Override
			public void like() {
				this.curtidas = curtidas +1;
				
			}

			@Override
			public String toString() {
				return "Video [titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas="
						+ curtidas + ", reproduzindo=" + reproduzindo + "]";
			}
			
			
			
			
}
