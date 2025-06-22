public class Test
{
    public static void main(String[] args)
    {
        PaymentProcessor paySafe = new PaySafeAdapter();
        System.out.println("Payment Gateway: PaySafe");
        paySafe.processPayment();
        
        PaymentProcessor jusPay = new JusPayAdapter();
        System.out.println("\nPayment Gateway: JusPay");
        jusPay.processPayment();
        
        PaymentProcessor cash = new CashPaymentAdapter();
        System.out.println("\nPayment Gateway: Cash");
        cash.processPayment();
    }
}