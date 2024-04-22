package factorpattern;

public class FourWheelFactory implements VehicleFactory {
    
    @Override
    public Vehicle createVehicle()
    {
        return new FourWheeler();
    }
}
