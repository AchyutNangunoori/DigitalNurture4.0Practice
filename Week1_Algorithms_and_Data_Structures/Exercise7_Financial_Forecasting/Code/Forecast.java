public class Forecast 
{
    public static double calculateFutureValue(double presentValue, double rate, int years) 
    {
        if (years == 0) 
        {
            return presentValue;
        } 
        else 
        {
            return (1 + rate) * calculateFutureValue(presentValue, rate, years - 1);
        }
    }

    public static void main(String[] args) 
    {
        double presentValue = 1000;
        double rate = 0.60;
        int years = 5;

        double futureValue = calculateFutureValue(presentValue, rate, years);
        System.out.println("Present Value: " + presentValue);
        System.out.printf("Predicted value after %d years at %.2f rate: %.2f\n", years, rate, futureValue);
    }
}
