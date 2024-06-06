package DecoratorPattern;

public  class NormalTea implements Tea {


    
    @Override
    public String getDescription()
    {
        return "Normal Tea";
    }

    @Override
    public int getCost()
    {
        return 10;
    }
}
