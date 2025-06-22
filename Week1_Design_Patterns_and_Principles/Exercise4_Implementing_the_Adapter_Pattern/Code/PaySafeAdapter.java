public class PaySafeAdapter implements PaymentProcessor
{
    private PaySafe paySafeInstance;
    
    public PaySafeAdapter()
    {
        paySafeInstance = new PaySafe();
    }
    
    public void processPayment()
    {
        paySafeInstance.makePayment();
    }
}