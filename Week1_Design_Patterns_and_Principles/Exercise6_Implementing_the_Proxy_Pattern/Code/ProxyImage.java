import java.util.*;

public class ProxyImage implements Image 
{
    RealImage realImage;
    String imgFile;
    private static Map<String,Image> cache = new HashMap<String,Image>();
    
    public ProxyImage(String imgFile)
    {
        this.imgFile = imgFile;
    }
    
    public void display()
    {
        Image img = cache.get(imgFile);
        if(img == null)
        {
            System.out.println("Image not present in cache");
            System.out.println("Loading Image");
            realImage = new RealImage(imgFile);
            cache.put(imgFile,realImage);
            realImage.display();
        }
        else
        {
            System.out.println("Image present in cache");
            img.display();
        }
    }
}