package Graph;

public class MatrixRep {

	
	public static void main(String a[]) {
		
		graph g=new graph(4);
		g.addEdge(0, 1);

		
		
		
	}
	
	
	
	
	

}




class graph{
	int vertices;
	boolean[][] adj;
	
	graph(int vertices){
		this.vertices=vertices;
		adj=new boolean[vertices][vertices];
	}
	
	
	public void addEdge(int u,int v) {
	adj[u][v]=true;
	adj[v][u]=true;
		
	}
	
	
	public void removeEdge(int u,int v) {
		
	}
	
	
	
	
	
	
}
