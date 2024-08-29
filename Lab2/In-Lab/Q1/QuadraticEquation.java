package quadratic;

public class QuadraticEquation 
{
	private int a;
	private int b;
	private int c;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	
	public int getDiscriminant()
	{
		return((b*b)-4*a*c);
	}
	public double getRoot1()
	{
		return(-b-(Math.sqrt(b*b)-4*a*c));
	}
	public double getRoot2()
	{
		return(b-(Math.sqrt(b*b)-4*a*c));
	}
}
