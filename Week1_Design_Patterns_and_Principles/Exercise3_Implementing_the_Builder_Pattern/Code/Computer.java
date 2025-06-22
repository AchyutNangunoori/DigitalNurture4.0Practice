public class Computer
{
    private String cpu;
    private String ram;
    private String storage;
    private String graphics;
    private int price;
    
    private Computer(Builder assemble)
    {
        this.cpu = assemble.cpu;
        this.ram = assemble.ram;
        this.storage = assemble.storage;
        this.graphics = assemble.graphics;
        this.price = assemble.price;
    }
    
    public static class Builder
    {
        private String cpu;
        private String ram;
        private String storage;
        private String graphics;
        private int price;
        
        public Builder(String cpu)
        {
            this.cpu = cpu;
        }
        
        public Builder setRam(String ram)
        {
            this.ram = ram;
            return this;
        }
        
        public Builder setStorage(String storage)
        {
            this.storage = storage;
            return this;
        }
        
        public Builder setGraphics(String graphics)
        {
            this.graphics = graphics;
            return this;
        }
        
        public Builder setPrice(int price)
        {
            this.price = price;
            return this;
        }
        
        public Computer build()
        {
            return new Computer(this);
        }
    }
    
    public void checkDetails()
    {
        System.out.println("The detils are");
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println("Graphics: " + graphics);
        System.out.println("Price: " + price);
    }
}