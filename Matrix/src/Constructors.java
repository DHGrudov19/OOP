import org.w3c.dom.ls.LSOutput;

public class Constructors {


String firstName;
String lastName;
int age;
    public Constructors(String firstValue, String secondValue){
       firstName=firstValue;
       lastName=secondValue;

    }

    public Constructors(String firstValue, String secondValue, int thirdValue)
    {
       firstName=firstValue;
       lastName=secondValue;
       age=thirdValue;
    }



}

class Second
{
    public static void main(String[] args) {
        String first="Iva",last="n";
        int age=1;
        Constructors obj1 = new Constructors(first,last);
        Constructors obj2 = new Constructors("Motko","Motkov",21);

        System.out.println(obj1.firstName+" "+obj1.lastName);

        System.out.println(obj2.firstName+" "+obj2.lastName+" "+obj2.age);



    }
}
