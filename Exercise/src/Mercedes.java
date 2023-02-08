public class Mercedes extends Car implements Vehicle{
    @Override
    public void startVehicle() {
        System.out.println("Mercedes was started!");
    }
    public int returnTires()
    {
        return tires;
    }
}
