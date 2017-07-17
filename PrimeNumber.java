package primeNumber;

public class PrimeNumber 
{
	public static void prime_number (int lim)
	{
		int flag;
		System.out.print("Prime numbers till "+ lim + " are: ");
		for(int i=2; i<=lim; i++) 
		{
			flag=0;
			for (int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					flag = 1;
				}
			}
			if(flag==0) 
			{
				System.out.print(i +" ");
			}
			
		}
    }
}
