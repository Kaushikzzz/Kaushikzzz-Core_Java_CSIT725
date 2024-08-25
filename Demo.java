package Airthematic;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) 
	{
			System.out.println("Enter a number");
			Scanner s = new Scanner(System.in);
			int x = s.nextInt();
			System.out.println("Factorial of" +x+"="+Math2.factorial(x));
			if(Math2.isStrong(x)==true)
			{
				System.out.println(x+"is a Strong number");
			}
			else 
				System.out.println(x+"is not a Strong number");
	}

}
