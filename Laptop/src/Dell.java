public class Dell extends Laptop{
    public Dell()
    {

    }
    public Dell(String name)
    {
        super(name);
    }
    public String getDetails()
    {
        return getName();
    }

    public static void main(String[] args) {
        Dell obj = new Dell("Dell Inspiron");
        System.out.println(obj.getDetails());
    }
}
