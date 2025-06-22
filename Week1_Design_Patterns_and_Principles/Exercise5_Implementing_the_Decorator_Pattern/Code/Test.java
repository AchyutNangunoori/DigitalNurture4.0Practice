public class Test
{
    public static void main(String[] args)
    {
        Notifier notify = new EmailNotifier("This is a notification");
        notify.send();
        System.out.println("Ony Email Notification sent\n");
        
        NotifierDecorator smsNotify = new SmsNotifierDecorator(notify);
        smsNotify.send();
        System.out.println("Email and SMS Notification sent\n");
        
        NotifierDecorator slackNotify = new SlackNotifierDecorator(notify);
        slackNotify.send();
        System.out.println("Email and Slack Notification sent");
        
    }
}