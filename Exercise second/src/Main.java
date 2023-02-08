public class Main {
    int a;
    double b;
public double sumNum(int a ,double b)
{
    return a+b;
}
public double substractionNum(int a, double b)
{
    return a-b;
}
public double multiplicationNum(int a, double b)
{
    return a*b;
}
public double divisionNum(int a, double b)
{
    return a/b;
}
    public static void main(String[] args) {
       Main obj = new Main();
       System.out.println(obj.sumNum(5,5.5));
       System.out.println(obj.divisionNum(15,3));
       System.out.println(obj.multiplicationNum(10,2.5));
       System.out.println(obj.substractionNum(20,7.8));
    }
}
