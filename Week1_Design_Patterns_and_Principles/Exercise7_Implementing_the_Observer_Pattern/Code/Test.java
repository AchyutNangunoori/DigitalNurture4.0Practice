public class Test
{
    public static void main(String[] args)
    {
        Stock s1 = new StockMarket();
        Observer mobile = new MobileApp();
        Observer web = new WebApp();
        
        s1.register(mobile);
        System.out.println("MobileApp added as an Observer");
        
        s1.register(web);
        System.out.println("WebApp added as an Observer\n");
        
        System.out.println("Send Notification to all observers");
        s1.sendNotification();
        System.out.println("Notification sent to all observers\n");
        
        s1.deregister(mobile);
        System.out.println("MobileApp removed as an Observer\n");
        
        System.out.println("Send Notification to all observers");
        s1.sendNotification();
        System.out.println("Notification sent to all observers");
    }
}