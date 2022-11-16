import java.util.Scanner;

public class Min {

    static void minNum(int a, int b, int c)
    {
        int firstMin;
        firstMin = Math.min(Math.min(a,b),c);
        System.out.println(firstMin);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        a = Integer.parseInt(scan.nextLine());
        b = Integer.parseInt(scan.nextLine());
        c = Integer.parseInt(scan.nextLine());

        minNum(a, b, c);



/*
        if(a<b&&a<c)
        {
            System.out.println(a);
        }
        else if(b<a&&b<c)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println(c);
        }*/


    }


}
