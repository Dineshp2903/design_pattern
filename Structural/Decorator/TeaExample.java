package DecoratorPattern;

public class TeaExample {

    public static void main(String[] args) {
        Tea nTea = new NormalTea();
        System.out.println(nTea.getDescription()+" $ "+nTea.getCost());

        Tea milkTea = new MilkTea(nTea);
        System.out.println(milkTea.getDescription()+" $ "+milkTea.getCost());


        Tea gingertea = new GingerTea(milkTea);
        System.out.println(gingertea.getDescription()+" $ "+gingertea.getCost());


        

    }
    
}
