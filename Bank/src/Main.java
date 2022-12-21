import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle firstFigure = new Circle();
        double radius;
        Scanner scan = new Scanner(System.in);
        radius = scan.nextDouble();
        firstFigure.setRadius(radius);
        System.out.println(firstFigure);
    }

}
