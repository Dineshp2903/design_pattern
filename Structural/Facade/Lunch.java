package FacadePattern;

public class Lunch implements Hotel{

    @Override
    public void getMenu()
    {
        System.out.println("Lunch Menu: Biriyani Non veg thalis");
    }
    @Override
    public void OrderFood(String food)
    {
        System.out.println("Your lunch food is "+food);
    }


}
