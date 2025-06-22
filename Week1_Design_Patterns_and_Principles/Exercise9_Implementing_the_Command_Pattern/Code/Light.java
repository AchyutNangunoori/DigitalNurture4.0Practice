public class Light
{
    private String status = "Light is Off";
    
    public void turnOn()
    {
        status = "Light is On";
    }
    
    public void turnOff()
    {
        status = "Light is Off";
    }
    
    public String check()
    {
        return status;
    }
}