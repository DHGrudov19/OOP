public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1;
        this.color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return Math.PI * (2 * radius);
    }

    @Override
    public String toString() {
        return "The circle radius is " + getRadius() + " the area of the circle is " + getArea() + " and the circumference is " + getCircumference();
    }

}
