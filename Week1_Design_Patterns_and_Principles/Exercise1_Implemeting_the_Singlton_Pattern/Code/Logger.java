public class Logger
{
    private static Logger instance;
    private Logger()
    {
        System.out.println("Logger Initialized");
    }
    public static Logger getInstance()
    {
        if(instance == null)
        {
            System.out.println("Instance does not exist");
            System.out.println("Creating first instance");
            instance = new Logger();
        }
        else
        {
            System.out.println("Instance already created");
            System.out.println("Returning same instance");
        }
        return instance;
    }
}