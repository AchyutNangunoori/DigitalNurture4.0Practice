public abstract class NotifierDecorator implements Notifier
{
    Notifier notifierObj;
    
    public NotifierDecorator(Notifier notifierObj)
    {
        this.notifierObj = notifierObj;
    }
}