package quadratic;

public class MyClass
{
	public static void main(String[] args) 
	{
		QuadraticEquation q1 = new QuadraticEquation();
		q1.setA(10);
		q1.setB(15);
		q1.setC(20);
		System.out.println("The root 1 value is:"+q1.getRoot1());
		System.out.println("The root 2 value is:"+q1.getRoot2());
	}
}
