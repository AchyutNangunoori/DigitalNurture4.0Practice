public class EmailNotifier implements Notifier
{
    private String notification;
    
    public EmailNotifier(String notification)
    {
        this.notification = notification;
    }
    
    public void send()
    {
        System.out.println("Email Notification: " + notification);
    }
}