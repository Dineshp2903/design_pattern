package MediatorPattern;



import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements Mediator {

    List<User> users;

    public ChatMediator()
    {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user)
    {
        this.users.add(user);
    }

    @Override
    public void sendMessage(User user,String messages)
    {
        for(User u: this.users)
        {
            if(u != user)
            {
                u.receive(messages);
            }
        }
    }
    

    
}
