
public class Homework2 
{
	public static int recPow(int n)
	{
		// computes 2^n for n >= 0
		if (n == 0)
			return 1;
		if (n == 1)
			return 2;
		else 
			return 2 * recPow(n-1);
		
		
	}
	public static void main(String[] args) 
	{
		for (int a = 0; a <= 20; a++)
		System.out.println ("2 to the power of " + a + " is " +recPow(a));
	}
}




