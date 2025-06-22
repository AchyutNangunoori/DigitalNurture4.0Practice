public class Test
{
    public static void main(String[] args)
    {
        Computer comp1 = new Computer.Builder("i7")
                             .setRam("4 GB")
                             .setStorage("256 SSD")
                             .setGraphics("xe")
                             .setPrice(75000)
                             .build();
        System.out.println("Computer 1 Created\n");
        comp1.checkDetails();
        
        Computer comp2 = new Computer.Builder("i9")
                             .setRam("8 GB")
                             .setStorage("512 SSD")
                             .setGraphics("iris")
                             .setPrice(150000)
                             .build();
        System.out.println("\nComputer 2 Created\n");
        comp2.checkDetails();
    }
}