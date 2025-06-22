public class Test
{
    public static void main(String[] args)
    {
        PaymentContext payment1 = new PaymentContext(new CreditCardPayment());
        System.out.println("Making a payment using Credit Card");
        payment1.transaction();
        
        PaymentContext payment2 = new PaymentContext(new PayPalPayment());
        System.out.println("\nMaking a payment using PayPal");
        payment2.transaction();
    }
}