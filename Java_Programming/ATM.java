class ATM 
{
	public static void main(String[] args) 
	{
		int dbpin=1234;
		int dbamt=1000;
		int pin=1235;

	    if(pin==dbpin)
		{
			int amt=100;
			if(amt<=dbamt)
			{
				System.out.println("Transaction successful");
			}
			else
			{
				System.out.println("Insufficient Fund");
			}
		}
		else
		{
			System.out.println("invalid pin!!!");
		}
	}
}
