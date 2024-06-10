package FacadePattern;

public class FoodFacadeImpl implements FoodFacade{
    private Hotel breakfast ;
    private Hotel lunch ;
    private Hotel dinner ;

    public FoodFacadeImpl(Hotel breakfast,Hotel lunch, Hotel dinner)
    {
        this.breakfast = breakfast;
        this.lunch = lunch;
        this.dinner = dinner;
    }

    @Override
    public void getBreakFastMenu()
    {
        this.breakfast.getMenu();
    }
    @Override
    public void getLunchMenu()
    {
        this.lunch.getMenu();
    }
    @Override
    public void getDinnerMenu()
    {
        this.dinner.getMenu();
    }
    @Override
    public void OrderBreakfast(String food)
    {
        this.breakfast.OrderFood(food);
    }
    @Override
    public void OrderLunch(String food)
    {
        this.lunch.OrderFood(food);
    }
    @Override
    public void OrderDinner(String food)
    {
        this.dinner.OrderFood(food);
    }

}
