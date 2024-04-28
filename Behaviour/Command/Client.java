package CommandPattern;

public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        Command turnOnCommand = new TurnOn(light);
        Command turnOffCommand = new TurnOff(light);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(turnOnCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(turnOffCommand);
        remoteControl.pressButton();


    }    
}
