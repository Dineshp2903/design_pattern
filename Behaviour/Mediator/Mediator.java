package MediatorPattern;

public interface Mediator {

    public void addUser(User user);
    public void sendMessage(User user,String message);
    
}
