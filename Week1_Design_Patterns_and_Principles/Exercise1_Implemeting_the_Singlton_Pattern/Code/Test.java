public class Test
{
    public static void main(String[] args)
    {
        System.out.println("Creating first instance l1 of Logger Class\n");
        Logger l1 = Logger.getInstance();
        System.out.println("\nCreating second instance l2 of Logger Class\n");
        Logger l2 = Logger.getInstance();
        System.out.println("\nVerifying only if one instance of Logger is created");
        if(l1==l2)
        {
            System.out.println("Yes, Only one instance of Logger is created");
        }
        else
        {
            System.out.println("No, Multiple instaces created");
        }
    }
}