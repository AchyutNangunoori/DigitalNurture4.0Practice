public class SmsNotifierDecorator extends NotifierDecorator
{
    public SmsNotifierDecorator(Notifier notifierObj)
    {
        super(notifierObj);
    }
    
    public void send()
    {
        notifierObj.send();
        System.out.println("SMS Notification: This is an SMS Notification");
    }
}