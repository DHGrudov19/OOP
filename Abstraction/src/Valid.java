import java.util.Scanner;

public class Valid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        if(num>=1&&num%5==0)
        {
            System.out.println("Valid!");
        }
        else
        {
            System.out.println("Invalid!");
        }

    }
}
