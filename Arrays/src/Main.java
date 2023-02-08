import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] cars = {"BMW","Mercedes", "Audi","Opel"};
        System.out.println(String.join(", ",cars));

//        for(int i = 0; i < cars.length; i++)
//        {
//            System.out.println(cars[i]);
//            cars[i] = "Honda";
//        }
        for(int i = 0; i < cars.length; i++)
        {
            System.out.println(cars[i]);
        }

        for(String element : cars)
        {
            System.out.println(element);
        }
    }
}
