package ChainOfResponsbility;

public class Level2SupportHandler implements SupportHandler {

    private SupportHandler nexHandler;
    @Override
    public void handleRequest(Request request)
    {
        if(request.getPriority() == Priority.INTERMEDIATE)
        {
            System.out.println("Level 2 Support Staff handling");
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
