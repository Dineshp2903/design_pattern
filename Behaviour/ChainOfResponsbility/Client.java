package ChainOfResponsbility;

public class Client {
    
    public static void main(String[] args) {
        SupportHandler lHandler1 = new Level1SupportHandler();
        SupportHandler lHandler2 = new Level2SupportHandler();
        SupportHandler lHandler3 = new Level3SupportHandler();
        lHandler2.setNextHandler(lHandler3);
        lHandler1.setNextHandler(lHandler2);

        Request request1 = new Request(Priority.BASIC);
        Request request2 = new Request(Priority.INTERMEDIATE);
        Request request3 = new Request(Priority.CRITICAL);
        lHandler1.handleRequest(request1);
        lHandler1.handleRequest(request2);
        lHandler1.handleRequest(request3);
    }
}
