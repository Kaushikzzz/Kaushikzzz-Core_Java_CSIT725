package stock;
public class Stock 
{    
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public String getSymbol()
    {
        return symbol;
    }

    public void setSymbol(String symbol) 
    {
        this.symbol = symbol;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public double getPreviousClosingPrice() 
    {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) 
    {
        this.previousClosingPrice = previousClosingPrice;
    }
    
    public double getCurrentPrice() 
    {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice)
    {
        this.currentPrice = currentPrice;
    }

    public double getChangePercent() 
    {
        if (previousClosingPrice == 0) 
        {
            return 0; 
        }
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }
    
}
