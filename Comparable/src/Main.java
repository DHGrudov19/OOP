import java.util.Objects;

public class Main {

    public static void main(String[] args) {
//        String first = "a";
//        String second = "A";
//
//        int result = first.compareTo(second);
//        System.out.println(result);
//
//
        Car car = new Car("Mercedes","ML",15);
        Car car1 = new Car("Opel","Astra",20);
        Car car2 = new Car("VW","Golf",10);
        Car car3 = new Car("Mercedes","ML",15);

    CarComparatorByBrand comparatorByBrand = new CarComparatorByBrand();
    int result = comparatorByBrand.compare(car,car2);
        System.out.println(result);
    }
}
