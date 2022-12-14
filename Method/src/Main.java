import java.util.Scanner;

public class Main {
    private String name;
    private int age;

    public void setName(String name)
    {
        if(name.isEmpty())
        {
            System.out.println("You must fill the name!");
            System.exit(0);
        }
        this.name=name;
    }
    public void setAge(int age)
    {
        if(age<18)
        {
            System.out.println("You must be at least 18 years old!");
            System.exit(0);
        }
        this.age=age;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }

    @Override
    public String toString()
    {
        return getName() + " " + getAge()+".5";
    }
    public static void main(String[] args) {
        Main first = new Main();
        Scanner scan = new Scanner(System.in);
        String name=scan.nextLine();
        int age=scan.nextInt();
        first.setName(name);
        first.setAge(age);
        System.out.println(first);
    }
}
