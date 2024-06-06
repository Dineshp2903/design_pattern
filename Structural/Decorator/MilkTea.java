package DecoratorPattern;

public class MilkTea extends TeaDecorator {

    public MilkTea(Tea tea)
    {
        super(tea);
    }

    @Override
    public String getDescription()
    {
        return this.tea.getDescription() + " + Milk";
    }
    @Override
    public int getCost()
    {
        return this.tea.getCost() + 5;
    }

    
}
