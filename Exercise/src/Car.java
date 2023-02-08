public class Car implements Vehicle{
    @Override
    public void startVehicle() {
        System.out.println("Car was started!");
    }
    protected int horsepower;
    private String electricCar = "Tesla";
}
