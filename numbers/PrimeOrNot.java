//Program to check whether the given numis prime or not
import java.util.Scanner;
class PrimeOrNot 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		boolean b=isPrime(num);
		if(isPrime(num))
		{
			System.out.println(num + " is a prime number");
		}
		else
		{
			System.out.println(num + " is not a prime number");
		}
	}


		
	
	public static boolean isPrime(int num)
	{
		if(num==1)
		{
			return false;
		}
		else
		{
			for (int i=2 ;i<num ;i++)
			{
				if(num%i == 0)
				{
					return false;
				}

			}
			return true;
		}
	}
}
