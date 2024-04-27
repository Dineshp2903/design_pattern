package adapterpattern;

public class InrToUSDConverter implements CurrencyConverter {

    private double exRate = 0.10;
    @Override
    public double convertToUSD(double price)
    {
        return exRate * price;
    }
    
}
