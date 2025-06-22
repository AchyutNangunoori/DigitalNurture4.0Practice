public class RemoteControl
{
    private Command command;
    
    public void operate(Command command)
    {
        this.command = command;
        command.execute();
    }
    
}