public class Audi extends CarImpl implements Rentable{
    int minRentDay;
    double price;
    public Audi(String model, String color, int horsePower, String countryProduced,int minRentDay, double price) {
        super(model, color, horsePower, countryProduced);
        this.minRentDay = minRentDay;
        this.price = price;
    }

    @Override
    public int getMinRentDay() {
        return this.minRentDay;
    }

    @Override
    public double getPricePerDay() {
        return this.price;
    }

    @Override
    public String toString()
    {
        return super.toString() + String.format("%nMinimum rental period of %d days. Price per day %.2f",this.minRentDay,this.price);
    }
}
