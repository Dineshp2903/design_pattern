package MediatorPattern;

public class UserImpl extends User {


    public UserImpl(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message)
    {
        System.out.println(this.name + " : Sending Message = "+message);
        mediator.sendMessage(this, message);
    }
    @Override
    public void receive(String message)
    {
        System.out.println(this.name + " Received a Message "+message);
    }
    
}
