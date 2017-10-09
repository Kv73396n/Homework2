
public class Homework2gcd 
{
	public static int gcd(int a, int b)
	{
		
		int y1 = a;
		int y2 = b;
		while (y1 != 0)
		{
			gcd(y1, (y1 % y2));
		}
		return y1;
		
	}
	
}




