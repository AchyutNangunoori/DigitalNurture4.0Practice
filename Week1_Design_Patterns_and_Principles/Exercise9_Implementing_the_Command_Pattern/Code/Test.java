public class Test
{
    public static void main(String[] args)
    {
        Light light = new Light();
        
        System.out.println("Current Status: " + light.check() + "\n");
        
        Command lightOn = new LightOnCommand(light);
        System.out.println("A command is created to turn on the light");
        
        Command lightOff = new LightOffCommand(light);
        System.out.println("Another command is created to turn off the light\n");
        
        RemoteControl remote = new RemoteControl();
        System.out.println("A remote control is created to turn on and off the light\n");
        
        remote.operate(lightOn);
        System.out.println("Light is turned on from the remote control");
        System.out.println("Current Status: " + light.check() + "\n");
        
        remote.operate(lightOff);
        System.out.println("Light is turned off from the remote control");
        System.out.println("Current Status: " + light.check());
        
    }
}