//Program to remove the duplicates from a String
class RemoveTheDuplicate
{
	public static void main(String[] args) 
	{
		String s="Hello";
		char[] ch=s.toCharArray();
		for(char i:ch)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("The unique elements in array are");
		uniqueOcc(ch);
	}
	public static void uniqueOcc(char[] ch)
	{
		int count1=0;
		for(int i =0; i<ch.length; i++)
		{
			int count=1;
			if(ch[i] !='/')
			{
				for(int j =i+1 ; j<ch.length ; j++)
				{
					if(ch[j] !='/')
					{
						if(ch[i]==ch[j])
						{
							count++;
							ch[j]='/';
						}
					}
				}
				
				if(count==1)
				{
					System.out.print(ch[i]+" ");   
				}
				
				
			}
		}
	}
}

