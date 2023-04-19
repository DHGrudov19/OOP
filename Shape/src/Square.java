public class Square extends Shape{

        private double a;
        private double b;

        public Square() {
        }

        public Square(double a, double b) {
            this.a = a;
            this.b = b;
        }

        public double getA() {
            return a;
        }

        public void setA(double a) {
            this.a = a;
        }

        public double getB() {
            return b;
        }

        public void setB(double b) {
            this.b = b;
        }

    @Override
    public double findP() {
        return this.a*2+this.b*2;
    }

    @Override
    public double findS() {
        return this.a*this.b;
    }
}

