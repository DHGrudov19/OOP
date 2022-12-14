import java.util.*;
public class Multiple {


    String name;
    int age;
    int salary;

    public Multiple(String name, int age, int salary)
    {
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);


        for(int i = 0; i < 3; i++)
        {
            Multiple[] obj = new Multiple[]{obj[i].name,obj[i].age,obj[i].salary};
        }

    }

}
