import java.util.Comparator;

public class Car implements Comparable<Car> {
    private String brand;
    private String model;
    private int age;

    public Car(String brand, String model, int age) {
        this.brand = brand;
        this.model = model;
        this.age = age;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Car o) {
     return this.brand.compareTo(o.getBrand());
    }


}
