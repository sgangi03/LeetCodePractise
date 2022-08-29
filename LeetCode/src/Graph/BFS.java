package Graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;



public class BFS {
	
	public static void main(String[] args) {
		GraphTraversalBFS g=new GraphTraversalBFS(4);
				
			
		 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        
        g.traversal(2);
		
	}

}






class GraphTraversalBFS
{
	int vertices;
	
	List<List<Integer>> edges=new ArrayList<>();
	
	GraphTraversalBFS(int vertices)
	{
		this.vertices=vertices;
	
		for(int i=0;i<vertices;i++)
			edges.add(new ArrayList<>());
		
	}
	
	
	
	
	
	public void addEdge(int u,int v) {
		
		edges.get(u).add(v);
		edges.get(v).add(u);
		
	}
	
	
	
	
	public void traversal(int start) {
	
	Set<Integer> visited=new HashSet<>();
	Queue<Integer> q=new LinkedList<>();
	q.add(start);
	visited.add(start);
	
	while(!q.isEmpty())
	{
		
		Integer ver=q.poll();
		System.out.println(ver);
	
		for(int i=0;i<edges.get(ver).size();i++)
		{
			
			Integer v=edges.get(ver).get(i);
			
			if(!visited.contains(v))
			{
				q.add(v);
			
			visited.add(v);
			}			
		}
		
		
	}
	
	
	
	
		
	
}
	
	
	
	
	
	
	
	
	
	

}