public class Test
{
    public static void main(String[] args)
    {
        System.out.println("Accessing an image Image1 for the first time");
        Image image1 = new ProxyImage("image1.jpg");
        image1.display();
        
        System.out.println("\nAccessing another image Image2 for the first time");
        Image image2 = new ProxyImage("image2.jpg");
        image2.display();
        
        System.out.println("\nAccessing first image Image1 for the second time");
        Image image3 = new ProxyImage("image1.jpg");
        image3.display();
    }
}