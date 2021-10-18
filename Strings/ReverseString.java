//Program to reverse a String
class ReverseString 
{
	public static void main(String[] args) 
	{
		String s="MadaM";
		System.out.println(s);
		reverseString(s);
	}
	public static void reverseString(String s)
	{
		String[] str=s.split(" ");
		for(int i =0 ; i <str.length/2 ; i++)
		{
			String temp=str[i];
			str[i]=str[str.length-1-i];
			str[str.length-1-i]=temp;
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
