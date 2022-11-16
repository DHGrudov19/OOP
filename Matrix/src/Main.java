import java.util.*;
class Triangle
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double num1, num2, num3;

        double height;
        Main obj1 = new Main();
        System.out.println("Do you know the 3 sides?");
        int input = scan.nextInt();
        if (input == 1) {
            num1 = scan.nextDouble();
            num2 = scan.nextDouble();
            num3 = scan.nextDouble();
            obj1.heron(num1, num2, num3);
            System.out.println(obj1.S);
        } else {
            System.out.println("Do you know the height?");
            if (input == 1) {
                num1 = scan.nextDouble();
                height = scan.nextDouble();
                obj1.heightFormula(num1, height);
                System.out.println(obj1.S);
            } else {
                System.out.println("Do you know only two sides?");
                if (input == 1) {
                    num1 = scan.nextDouble();
                    num2 = scan.nextDouble();
                    obj1.twoSideFormula(num1, num2);
                    System.out.println(obj1.S);
                }
            }
        }
    }
}
public class Main {


    double S=0;
    double p=0;
    //√p(p - a)(p - b)(p - c)
    public double heron(double a, double b, double c)
    {
        p=(a+b+c)/2;
        S=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return S;
    }

    //S = ½(a.ha) = ½(b.hb) = ½(c.hc)
    public double heightFormula(double x, double hx)
    {
        S = (x*hx)/2;
        return S;
    }

    public double twoSideFormula(double x, double y)
    {
        S = (x*y)/2;
        return S;
    }

}
