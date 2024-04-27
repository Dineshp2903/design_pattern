package ChainOfResponsbility;

public class Level1SupportHandler implements SupportHandler {

    private SupportHandler nexHandler;
    @Override
    public void handleRequest(Request request)
    {
        if(request.getPriority() == Priority.BASIC)
        {
            System.out.println("Level Support Staff handling");
        }
        else{
            this.nexHandler.handleRequest(request);
        }
    }
    @Override
    public void setNextHandler(SupportHandler nHandler){
        this.nexHandler = nHandler;
    }
    
}
