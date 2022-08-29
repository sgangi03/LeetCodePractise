package Graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class DFSIterative {
public static void main(String[] args) {
	
	GraphTraversalDFS g=new GraphTraversalDFS(5);
	 g.addEdge(1, 0);
     g.addEdge(0, 2);
     g.addEdge(2, 1);
     g.addEdge(0, 3);
     g.addEdge(1, 4);
          
     System.out.println("Following is the Depth First Traversal");
     g.traversalDFS(0);
}
}





class GraphTraversalDFS{
	
	int vertices;
	List<List<Integer>> edges=new ArrayList<>();
	
	public GraphTraversalDFS(int verices) {
		this.vertices=verices;
		
		for(int i=0;i<vertices;i++)
			edges.add(new ArrayList<>());
		
	}
	
	
	
	public void addEdge(int u,int v)
	{
		edges.get(u).add(v);
		
	}
	
	
	
	
	public void traversalDFS(int start) {
		
		Set<Integer> visited=new HashSet<>();
		
		Stack<Integer> s=new Stack<>();
		s.add(start);
		visited.add(start);
		
		
		while(!s.isEmpty())
		{
			
			Integer ver=s.pop();			
			System.out.println(ver);
			
			for(int i=0;i<edges.get(ver).size();i++)
			{
				
				
				Integer v=edges.get(ver).get(i);
				
				if(!visited.contains(v))
				{
					
					s.add(v);
					visited.add(v);
					
				}
				
			}
			
			
			
		}
		
		
	}
	
	
}
