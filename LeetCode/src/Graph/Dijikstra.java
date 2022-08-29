package Graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;



public class Dijikstra {
	
	public static void main(String[] args) {
		
		GraphDij g=new GraphDij(5);
		g.addEdge(0,1, 9);
        g.addEdge(0,2, 6);
        g.addEdge(0,3, 5);
        g.addEdge(0,4, 3);
       
        g.addEdge(2,1, 2);
        g.addEdge(2,3, 4);
 
        
        int start=0;
      
        g.dijikstra( start);
 
        // Printing the shortest path to all the nodes
        // from the source node
        System.out.println("The shorted path from node :");
 
        for (int i = 0; i < 5; i++)
            System.out.println(start + " to " + i + " is "
                               + g.weight[i]);
        
	}

}






class GraphDij{
	
	List<List<Node>> edges=new ArrayList<>();
	
	int vertices;
	Integer[] weight;
	PriorityQueue<Node> pq=new PriorityQueue<>((a,b)->{	
		if(a.cost>b.cost)
		return 1;
		
		if(a.cost<b.cost)
			return -1;
			
			return 0;
	});
	
	Set<Integer> visited=new HashSet<>();
	
	GraphDij(int vertices){
		this.vertices=vertices;
		weight=new Integer[vertices];
		for(int i=0;i<vertices;i++) {
			edges.add(new ArrayList<>());
			weight[i]=Integer.MAX_VALUE;
		}
	}	
	
	
	
	
	public void addEdge(int u,int v,int cost) {
		
		
		edges.get(u).add(new Node(v,cost));
		
	}
	
	
	
	
	public void dijikstra(int start) {
		
		weight[start]=0;
		
		visited.add(start);
		pq.add(new Node(start,0));
		
		
		while(!pq.isEmpty())
		{
			
			   int u = pq.remove().val;
			   visited.add(u);
			   
			   for(int i=0;i<edges.get(u).size();i++)
			   {
				   
				   Node dest=edges.get(u).get(i);
				   
				   if(!visited.contains(dest.val)) {
				   int newDistance=weight[u]+dest.cost;
				   if(newDistance< weight[dest.val])
					   weight[dest.val]=newDistance;
				   
				   
			   pq.add(new Node(dest.val,weight[dest.val]));
				   }			   
			   }
			   
			   
			   
			
			
		}
		
	}
	
	
}





class Node{
	
	int cost;
	int val;
	Node(int val,int cost){
		this.cost=cost;
		this.val=val;
	}
	
}












