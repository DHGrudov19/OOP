import  java.util.Scanner;
class Car
{
    private String brand;
    private String model;
    private int horsepower;

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public void setModel(String model)
    {
        this.model = model;
    }
    public void setHorsepower(int horsepower)
    {
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

    public String carInfo()
    {
        return "The car is: "+getBrand()+" "+getModel()+"-"+getHorsepower()+"HP.";

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Car car = new Car();
        car.setBrand(scan.nextLine());
        car.setModel(scan.nextLine());
        car.setHorsepower(Integer.parseInt(scan.nextLine()));
        System.out.println(car.carInfo());
    }
}
