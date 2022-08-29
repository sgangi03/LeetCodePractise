package Graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class DFSRecursion {
public static void main(String[] args) {
	
	GraphTraversalDFSRecursion g=new GraphTraversalDFSRecursion(5);
	 g.addEdge(1, 0);
     g.addEdge(0, 2);
     g.addEdge(2, 1);
     g.addEdge(0, 3);
     g.addEdge(1, 4);
          
     System.out.println("Following is the Depth First Traversal");
     g.traversalDFSRecursion(0);
}
}





class GraphTraversalDFSRecursion{
	
	int vertices;
	List<List<Integer>> edges=new ArrayList<>();
	Set<Integer> visited=new HashSet<>();
	public GraphTraversalDFSRecursion(int verices) {
		this.vertices=verices;
		
		for(int i=0;i<vertices;i++)
			edges.add(new ArrayList<>());
		
	}
	
	
	
	public void addEdge(int u,int v)
	{
		edges.get(u).add(v);
		
	}
	
	
	
	
	public void traversalDFSRecursion(int start) {
		
	
		
			if(visited.contains(start))
					return;
		visited.add(start);
		
		
		
					
			System.out.println(start);
			
			for(int i=0;i<edges.get(start).size();i++)
			{
				
				
				Integer v=edges.get(start).get(i);
				
				if(!visited.contains(v))
				{
					
					traversalDFSRecursion(v);
					
				}
				
			
			
			
			
		}
		
		
	}
	
	
}
