public class Circle extends Shape{
private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea()
    {
        return Math.PI*Math.pow(radius,2);
    }

    public static void main(String[] args) {
        Shape circle = new Circle(2);
        System.out.println(circle.getArea());
    }
}
