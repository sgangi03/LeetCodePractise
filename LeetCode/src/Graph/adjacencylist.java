package Graph;

import java.util.ArrayList;
import java.util.List;

public class adjacencylist {

	
	public static void main(String a[]) {
	graphrep g=new graphrep(4);
	g.addEdge(0, 0);
	
	}
	
}








class graphrep{
	
	int vertices;
	List<List<Integer>> adj=new ArrayList<>();
	
	
	public graphrep(int vertices) {
		this.vertices=vertices;
	
		for(int i=0;i<vertices;i++)
			adj.add(new ArrayList<>());
	
	}
	
	
	public void addEdge(int u,int v)
	{
		adj.get(u).add(v);
		
	}
	
}
