//Program to count the number of digits
import java.util.Scanner;
class CountDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The number :");
		int num=sc.nextInt();
		int count=digitsCount(num);
		System.out.println("The number of digits:"+count);

		
	    
	}
	public static int digitsCount(int num)
	{
		if(num==0)
		{
			return 1;
		}
		else
		{
			int count=0;
			while(num>0)
			{
				count++;
				num=num/10;
			}
			return count;
		}
	}
}
