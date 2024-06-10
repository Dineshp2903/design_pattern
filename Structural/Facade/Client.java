package FacadePattern;

public class Client {
    public static void main(String[] args) {
        FoodFacade foodFacade = new FoodFacadeImpl(new Breakfast(), new Lunch(), new Dinner());
        foodFacade.getBreakFastMenu();
        foodFacade.OrderBreakfast("Poori");
        foodFacade.getLunchMenu();
        foodFacade.OrderBreakfast("Biriyani");
        foodFacade.getDinnerMenu();
        foodFacade.OrderDinner("Parotta");

    }
}
