package CommandPattern;


//Concrete Command
public class TurnOn implements Command {

    private Light light;
    public TurnOn(Light light)
    {
        this.light = light;
    }
    
    @Override
    public void execute()
    {
        light.turntOn();
    }
}
