package leetPractise.Tree;

public class NBinaryTrees {

	
	public static int NumberofBST(int n)
	{
		
		int[] count=new int[n+1];
		
		count[0]=0;
		count[1]=1;
		count[2]=2;
		count[3]=5;
		
		for(int i=4;i<=n;i++) {
			
			for(int j=0;j<i;j++)
			{
				count[i]=count[i]+count[j]*count[i-j-1];
			}
			
		}
		
		return count[n];
		
	}
	
	
	
	public static void main(String a[]) {
	
		
		System.out.print(NumberofBST(5));
		
		
		
	}
}
