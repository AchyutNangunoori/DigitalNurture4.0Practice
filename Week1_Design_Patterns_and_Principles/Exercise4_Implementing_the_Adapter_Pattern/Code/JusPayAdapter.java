public class JusPayAdapter implements PaymentProcessor
{
    private JusPay JuspayInstance;
    
    public JusPayAdapter()
    {
        JuspayInstance = new JusPay();
    }
    
    public void processPayment()
    {
        JuspayInstance.makePayment();
    }
}