package ExercicioFinal;

public class Main {

	public static void main(String[] args) {
			
		Video v[] = new Video[3];
		
		v[0] = new Video("Java aula 01");
		
		v[1] = new Video("introdução ao javascript");
		
		v[2] = new Video("Engenharia de Software");
		
		System.out.println(v[2].toString());
		
		Gafanhoto g[] = new Gafanhoto[2];
		
		g[0] = new Gafanhoto("THaís", 29, "F", 1234);
		
		System.out.println(g[0].toString());
			
		Visualizacao vis[] = new Visualizacao[5];
		
		vis[0] = new Visualizacao(g[0], v[2]);
		
		System.out.println(vis[0].toString());
		
		vis[1] = new Visualizacao(g[0],v[1]);
		
		System.out.println(vis[1].toString());
		
	}

}
