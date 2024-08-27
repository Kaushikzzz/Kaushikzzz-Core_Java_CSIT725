package Airthematic;

public class Math2 {
	public static long factorial(int x)
	{
		long fact = 1;
		while(x>0)
		{
			fact*=x;
			x--;
		}
		return fact;
	}
	public static boolean isStrong(int x)
	{
		long sum = 0;
		while(x>0)
		{
			sum*= factorial(x%10);
			x/=10;
		}
		return (x==sum);
	}
}
