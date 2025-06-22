public class RealImage implements Image
{
    String imgFile;
    
    public RealImage(String imgFile)
    {
        this.imgFile = imgFile;
    }
    
    public void display()
    {
        System.out.println("Displaying the Image: " + imgFile);
    }
}