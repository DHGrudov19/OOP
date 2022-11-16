public class Car {
    public void printSpeed(int speed)
    {
        System.out.println("Speed: " + speed);
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.printSpeed(100);
    }
}
