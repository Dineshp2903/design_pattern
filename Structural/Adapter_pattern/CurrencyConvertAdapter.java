package adapterpattern;

public class CurrencyConvertAdapter implements ProductPriceCalculator {

    private CurrencyConverter currencyConverter;
    
    public CurrencyConvertAdapter(CurrencyConverter currencyConverter)
    {
        this.currencyConverter = currencyConverter;
    }

    @Override
    public double priceQuantityCalculator(double price , int qty)
    {
        price = this.currencyConverter.convertToUSD(price);
        return price * qty;
    }
}
