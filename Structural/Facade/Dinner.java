package FacadePattern;

public class Dinner implements Hotel{

    @Override
    public void getMenu()
    {
        System.out.println("Dinner Menu: Parotta Chapathi Fried Rice Fried Noodles");
    }
    @Override
    public void OrderFood(String food)
    {
        System.out.println("Your Dinner food is "+food);
    }


}
