class GreatestOfThreeNumber 
{
	public static void main(String[] args) 
	{
		int num1=20;
		int num2=99;
		int num3=13;
		if(num1>num2 && num1>num3)
		{
			System.out.println("Greatest is" +num1);
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println("Greatest is" +num2);
		}
		else if(num3>num1 && num3>num2)
		{
			System.out.println("Greatest is" +num3);
		}
		else
		{
			System.out.println("ALL ARE EQUAL");
		}
		}
}
