import java.util.*;

public class StockMarket implements Stock
{
    private static ArrayList<Observer> observerList = new ArrayList<Observer>();
    
    public void register(Observer observer)
    {
        observerList.add(observer);
    }
    
    public void deregister(Observer observer)
    {
        observerList.remove(observer);
    }
    
    public void sendNotification()
    {
        for(Observer observer : observerList)
        {
            observer.update();
        }
    }
}