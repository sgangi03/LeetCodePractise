
public class Sorting {
	
	public static void main(String a[]) {
		
		int[] ab= {9,5,2,1,3};
		
		/*
		 * Bubblesorting s=new Bubblesorting(ab); s.sort();
		 */
		
		selectionsorting ss=new selectionsorting(ab);
		ss.selectionsort();
		
		for(int i=0;i<ab.length;i++)
			System.out.print(" "+ab[i]);
	}

}

class Bubblesorting
{
	

	int[] a;
	public Bubblesorting(int[] a) {
		// TODO Auto-generated constructor stub
	this.a=a;
	}
	
	public void sort()
	{
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
				
			}
		}
	}
	
	
}



class selectionsorting
{
	

	int[] a;
	public selectionsorting(int[] a) {
		// TODO Auto-generated constructor stub
	this.a=a;
	}
	
	public void selectionsort()
	{
		
		for(int i=0;i<a.length-1;i++)
		{
			int min =i;
			for(int j=i+1;j<a.length;j++) {
				
				
				if(a[j]<=a[min])
				{
					min=j;
					
				}
				
				
			}
			int temp=a[i];		
			a[i]=a[min];
			a[min]=temp;
		
		}
	}
	
	
}

