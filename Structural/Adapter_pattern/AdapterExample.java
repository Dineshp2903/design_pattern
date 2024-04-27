package adapterpattern;

public class AdapterExample {



    public static void main(String args[])
    {
        ProductPriceCalculator productPriceCalculator = new DefaultProductPriceCalculator();
        double totalCost = productPriceCalculator.priceQuantityCalculator(1000, 5);
        System.out.println("Total Price Calculator "+totalCost);


        ProductPriceCalculator currencyPriceCalculator = new CurrencyConvertAdapter(new InrToUSDConverter());
        totalCost = currencyPriceCalculator.priceQuantityCalculator(1000, 5);
        System.out.println("Total Price Calculator "+totalCost);
    }

   


    
}
