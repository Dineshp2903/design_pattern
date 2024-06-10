package FacadePattern;

public class Breakfast implements Hotel {

    @Override
    public void getMenu() {
        System.out.println("BreakFast Menu: Poori Pongal Vada Idly Dosa");
    }

    @Override
    public void OrderFood(String food) {
        System.out.println("Your order food is "+food);
    }
    
}
