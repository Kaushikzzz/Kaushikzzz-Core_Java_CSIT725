package stock;
public class MyClass 
{
	public static void main(String[] args) 
	{
		Stock s1 = new Stock();
		s1.setName("KAUSHIK");
		s1.setSymbol("KZZZ");
		s1.setCurrentPrice(250000);
		s1.setPreviousClosingPrice(128000);
		System.out.println("The Name of stock is:"+s1.getName());
		System.out.println("Symbol is:"+s1.getSymbol());
		System.out.println("Current price is:"+s1.getCurrentPrice());
		System.out.println("Previous closing price is:"+s1.getPreviousClosingPrice());
		System.out.println("Change in percent is:"+s1.getChangePercent());
	}
}
