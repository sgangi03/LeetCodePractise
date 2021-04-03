package Tries;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Insertion {

	static Tries root=null;
	
	
	public static void insertion(String word)
	{
	
		Tries current=root;
		
		for(int i=0;i<word.length();i++)
		{
			Character c=word.charAt(i);
			
			
			if(!current.getChildren().containsKey(c))
			{
				current.getChildren().put(c, new Tries());
			}
			
			current=current.getChildren().get(c);
			
		}
		current.setFinal(true);
		
	}
	
	
	
	public static boolean search(String word)
	{
		Tries current=root;
		
		for(int i=0;i<word.length();i++)
	{
			Character c=word.charAt(i);
			
			if(current.getChildren().get(c)==null)
			return false;
			
			current=current.getChildren().get(c);
	}
		
		if(current.isFinal)
			return true;
		return false;
		
	}
	
	
	
	
	public static boolean delete(Tries current,String word,int index) {
		
		if(index==word.length())
		{
			
			if(!current.isFinal) {
				return false;
			}
			current.isFinal=false;
			 return current.children.size()==0;
			
				
		}
		
		Character c=word.charAt(index);
	Tries node=	current.getChildren().get(c);
		
	if(node==null)
		return false;
		
	boolean candelete=delete(node,word,index+1);
		if(candelete)
		{
			current.getChildren().remove(node);
			
			return current.getChildren().size()==0;
			
		}
		
		return false;
	}
	
	public static void main(String a[])
	{
		
		 root=new Tries();
		String[] words= {"the","apple","zebra",""};
		
		for(int i=0;i<words.length;i++)
		insertion(words[i]);
	
		System.out.print(search("appl"));
		System.out.print(delete(root,"apple",0));
		
	}
}





class Tries{
	Map<Character,Tries> children=new HashMap<>();
	boolean isFinal;
	public Map<Character, Tries> getChildren() {
		return children;
	}
	public void setChildren(Map<Character, Tries> children) {
		this.children = children;
	}
	public boolean isFinal() {
		return isFinal;
	}
	public void setFinal(boolean isFinal) {
		this.isFinal = isFinal;
	}
	
	
	
	
}
