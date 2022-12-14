public class Seat extends CarImpl implements Sellablle{

   private double price;
   public Seat(String model, String color, int horsePower, String countryProduced, double price)
   {
        super(model, color, horsePower, countryProduced);
        this.price=price;
   }

    @Override
    public double getPrice() {
        return this.price;
    }
    @Override
    public String toString()
    {
       return super.toString() + String.format("%n%s sells for %.2f",super.model, this.price);
    }
}


