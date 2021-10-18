//Program to reverse a String pattern different
class ReverseString2 
{
	public static void main(String[] args) 
	{
		String s="welcome to java class";
		System.out.println(s);
		reverseString(s);
	}
	public static void reverseString(String s)
	{
		String[] str=s.split(" ");
		for(int i =0 ; i <str.length ; i++)
		{
			str[i]=reverse(str[i]);
		}
		for(String ss:str)
		{
			System.out.print(ss+" ");
		}
		System.out.println();
	}
	public static String reverse(String s)
	{
		String rev="";
		for(int i =s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		return rev;
	}
	
}
