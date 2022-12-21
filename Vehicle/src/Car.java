import java.util.Scanner;

public class Car extends Vehicle{
    private String carName;

    public String getDetails(String carName)
    {
        Vehicle obj = new Car();
        return carName+ ", "+ obj.getModel() + ", "+obj.getSpeed();
    }

    public static void main(String[] args) {
        Car first = new Car();
        String name;
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();
        System.out.println(first.getDetails(name));
    }
}
