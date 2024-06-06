package DecoratorPattern;

public abstract class TeaDecorator implements Tea{

    protected Tea tea;

    public TeaDecorator(Tea tea)
    {
        this.tea = tea;
    }

    @Override
    public String getDescription()
    {
        return this.getDescription();
    }
    @Override
    public int getCost()
    {
        return this.getCost();
    }
    
}
