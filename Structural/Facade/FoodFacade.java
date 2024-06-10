package FacadePattern;

public interface FoodFacade {
    public void getBreakFastMenu();
    public void getLunchMenu();
    public void getDinnerMenu();
    public void OrderBreakfast(String food);
    public void OrderLunch(String food);
    public void OrderDinner(String food);  
}
