public class SlackNotifierDecorator extends NotifierDecorator
{
    public SlackNotifierDecorator(Notifier notifierObj)
    {
        super(notifierObj);
    }
    
    public void send()
    {
        notifierObj.send();
        System.out.println("Slack Notification: This is a Slack Notification");
    }
}