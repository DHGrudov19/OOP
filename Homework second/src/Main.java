class Car
{
    private String brand;
    private String model;
    private int horsepower;

    public Car()
    {
        this.brand = "unknown";
        this.model = "unknown";
        this.horsepower = -1;
    }
    public Car(String brand)
    {
        this.brand=brand;
        this.model="unknown";
        this.horsepower=-1;
    }
    public Car(String brand, String model, int horsepower)
    {
        this.brand=brand;
        this.model=model;
        this.horsepower=horsepower;
    }
    public String getBrand()
    {
        return brand;
    }
    public String getModel()
    {
        return model;
    }
    public int getHorsepower()
    {
        return horsepower;
    }
    @Override
    public String toString()
    {
        return brand+" "+model+" : "+horsepower;
    }
}


public class Main {

    public static void main(String[] args) {
        Car firstCar = new Car();
        Car secondCar = new Car("Mercedes");
        Car thirdCar = new Car("Mercedes","G63",500);

        System.out.println("First car: " + firstCar);
        System.out.println("Second car: " + secondCar);
        System.out.println("Third car: " + thirdCar);
    }
}
