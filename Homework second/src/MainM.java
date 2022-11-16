import java.util.Scanner;
public class MainM {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        n = Integer.parseInt(scan.nextLine());
        Person[] people = new Person[10];
        for(int i = 0; i < n; i++)
        {
            String[] input = scan.nextLine().split("\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            Person person = new Person(name, age);
        }
    }
}
