package CommandPattern;

// Concrete Command
public class TurnOff implements Command {

    private Light light;
    public TurnOff(Light light)
    {
        this.light = light;
    }

    @Override
    public void execute()
    {
        light.turnOff();
    }
    
}
