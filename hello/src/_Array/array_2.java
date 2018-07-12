package _Array;

public class array_2 {
	public static void main(String args[])
	{
		int[] a = Random(10,200);
		//bubbleSort(a);
		selectSort(a);
		print(a);
	}
	public static int[] Random(int n,int max)
	{
		int[] value = new int[n];
		for(int i=0;i<n;i++)
		{
			value[i]=(int)(Math.random()*max);		
		}
		return value;
	}
	
	public static void print(int... a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	public static void bubbleSort(int a[])
	{
		int i,j;
		for(i=0;i<a.length;i++)
			for(j=1;j<a.length;j++)
				if(a[j-1]>a[j])
				{
					int x= a[j-1];
					a[j-1]=a[j];
					a[j]=x;
				}
	}
	
	public static void selectSort(int a[])
	{
		for(int i=0;i<a.length-1;i++)
		{
			int min=i;
			for(int j=i;j<a.length;j++)
			{
				if(a[j]<a[min])
					min=j;
			}
			if(i!=min)
			{
				int tmp = a[i];
				a[i]=a[min];
				a[min]=tmp;
			}
			
		}
		
	}
	
}
