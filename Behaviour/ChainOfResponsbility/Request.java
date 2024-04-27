package ChainOfResponsbility;

enum Priority
{
    BASIC, INTERMEDIATE, CRITICAL
}
public class Request {
    private Priority priority;

    public Request(Priority priority)
    {
        this.priority=  priority;
    }
    public Priority getPriority()
    {
        return this.priority;
    }
}
