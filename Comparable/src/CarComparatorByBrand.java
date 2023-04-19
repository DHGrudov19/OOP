import java.util.Comparator;

public class CarComparatorByBrand implements Comparator<Car> {
    @Override
    public int compare(Car firstCar, Car secondCar) {
        return firstCar.getBrand().compareTo(secondCar.getBrand());
    }
}
