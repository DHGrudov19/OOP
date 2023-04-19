import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Box<String>> myList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String value = scanner.nextLine();
            Box<String> box = new Box(value);
            myList.add(box);
        }
        String[] indexes = scanner.nextLine().split("\\s+");

//        for (int i = 0; i < n; i++) {
//            int value = Integer.parseInt(scanner.nextLine());
//            Box<Integer> box = new Box(value);
//            System.out.println(box);
//        }


    }
}
