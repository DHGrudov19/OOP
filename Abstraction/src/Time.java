import java.util.Scanner;

public class Time {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String day = scan.nextLine();
        int hour = Integer.parseInt(scan.nextLine());
        if(day.equals("Monday")||day.equals("Tuesday")||day.equals("Wednesday")||day.equals("Thursday")||day.equals("Friday")||day.equals("Saturday"))
        {
            if(hour>10&&hour<18)
            {
                System.out.println("open");
            }
            else
            {
                System.out.println("closed");
            }
        }
        else
        {
            System.out.println("closed");
        }

    }
}
