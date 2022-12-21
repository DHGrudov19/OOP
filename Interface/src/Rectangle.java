public class Rectangle extends Polygon{

   private double a,b;

   public void setA(double a){
       this.a = a;
   }
   public void setB(double b){
       this.b = b;
   }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public double getCircumference() {
        return 2*a+2*b;
    }

}
