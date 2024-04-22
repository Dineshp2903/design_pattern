package factorpattern;

public class FactoryMain {

    public static void main(String[] args)
    {
        VehicleFactory vFactory = new TwoWheelFactory();
        Client honda = new Client(vFactory);
        Vehicle hVehicle = honda.getVehicle();
        hVehicle.printVehicle();



        VehicleFactory tFactory = new FourWheelFactory();
        Client tata = new Client(tFactory);
        Vehicle tVehicle = tata.getVehicle();
        tVehicle.printVehicle();
    }
    
}
