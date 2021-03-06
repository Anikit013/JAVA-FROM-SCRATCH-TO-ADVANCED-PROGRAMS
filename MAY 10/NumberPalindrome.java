//Program to find whether the given number id Palindrome or not
import java.util.Scanner;
class NumberPalindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		boolean b=palindrome(num);
		if(palindrome(num))
		{
			System.out.println(num+" is a Palindrome");
		}
		else
		{
			System.out.println(num+" is not a Palindrome");
		}

	}
	public static boolean palindrome(int num)
	{
		int rev=0,rem;
		int temp=num;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return temp==rev ? true : false;
	}
}
