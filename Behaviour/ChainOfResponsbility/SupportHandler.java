package ChainOfResponsbility;

public interface SupportHandler {
    public void handleRequest(Request request);
    public void setNextHandler(SupportHandler sHandler);
}
