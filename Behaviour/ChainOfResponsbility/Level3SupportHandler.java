package ChainOfResponsbility;

public class Level3SupportHandler  implements SupportHandler 
{
    private SupportHandler nexHandler;
    @Override
    public void handleRequest(Request request)
    {
        if(request.getPriority() == Priority.CRITICAL)
        {
            System.out.println("Level 3 Support Staff handling");
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
