package adapterpattern;

public class DefaultProductPriceCalculator implements ProductPriceCalculator {

    @Override
    public double priceQuantityCalculator(double price,int qty)
    {
        return price * qty;
    }
    
}
