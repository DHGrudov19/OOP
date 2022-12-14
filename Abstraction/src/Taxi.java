import java.util.Scanner;

public class Taxi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String month = scan.nextLine();
        String day = scan.nextLine();
        double km = Double.parseDouble(scan.nextLine());
        double price=0;
        if(month.equals("Jan")||month.equals("Feb")||month.equals("March")||month.equals("Apr"))
        {
            if(day.equals("Day"))
            {
                price = 0.81*km;
            }
            else if(day.equals("Night"))
            {
                price = 1*km;
            }
        }
        if(month.equals("May")||month.equals("June")||month.equals("July")||month.equals("Aug"))
        {
            if(day.equals("Day"))
            {
                price = 0.91*km;
            }
            else if(day.equals("Night"))
            {
                price = 1.05*km;
            }
        }
        if(month.equals("Sept")||month.equals("Oct")||month.equals("Nov")||month.equals("Dec"))
        {
            if(day=="Day")
            {
                price = 0.85*km;
            }
            else if(day.equals("Night"))
            {
                price = 1.03*km;
            }
        }
        System.out.println("Total cost: BGN "+price);
    }
}
