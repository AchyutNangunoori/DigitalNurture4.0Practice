public class CashPaymentAdapter implements PaymentProcessor
{
    private CashPayment cashPaymentInstance;
    
    public CashPaymentAdapter()
    {
        cashPaymentInstance = new CashPayment();
    }
    
    public void processPayment()
    {
        cashPaymentInstance.makePayment();
    }
}