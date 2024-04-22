package factorpattern;

public class TwoWheelFactory implements VehicleFactory {


    @Override
    public Vehicle createVehicle()
    {
        return new TwoWheeler();
    }
    
}
