package DecoratorPattern;

public class GingerTea extends TeaDecorator {

    public GingerTea(Tea tea) {
        super(tea);
    }

    @Override
    public String getDescription()
    {
        return this.tea.getDescription() + "+ Ginger";
    }
    @Override
    public int getCost()
    {
        return this.tea.getCost() + 5;
    }

    
}
