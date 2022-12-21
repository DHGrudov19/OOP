abstract class Polygon {
    abstract double getArea();
    abstract double getCircumference();
    @Override
    public String toString(){
        return "The area of this figure is " + getArea() + " and the circumference is " + getCircumference();
    }
}


