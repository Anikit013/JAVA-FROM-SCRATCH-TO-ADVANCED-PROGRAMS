//write a program to find Smallest and Largest Element in an Array
class SmallestLargest
{
	public static void main(String[] args) 
	{
		int[] a={2,3,6,5,7,3,0,9,1,2,1,7};
		largest(a);
		Smallest(a);
	}
	public static void largest(int[] a)
	{
		int max= a[0];
		for (int i=1;i< a.length;i++)
		{
			if (a[i] > max)
			{
				max=a[i];
			}
		}
		System.out.println(" Largest Element = "+ max);
	}

	public static void Smallest(int[] a)
	{
		int min = a[0];
		for (int i=1;i< a.length;i++)
		{
			if (a[i] < min)
			{
				min=a[i];
			}
		}
		System.out.println(" Smallest Element = "+ min);
	}
}
	