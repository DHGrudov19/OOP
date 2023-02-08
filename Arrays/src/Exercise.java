import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] tokens = input.split("\\s+");
        for(int i = 0; i < tokens.length/2; i++)
        {
            String temp = tokens[i];
            tokens[i] = tokens[tokens.length - 1 - i];
            tokens[tokens.length - 1 - i] = temp;
        }
        System.out.println(String.join(", ", tokens));
    }
}
