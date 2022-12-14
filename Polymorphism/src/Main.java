public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Gosho");
        Mammal person2 = new Person("Pesho");
        Animal person3 = new Person("Stamat");
        Student person4 = new Student();
        person1.sleep();
        person2.walk();
        person3.eat();
        person4.eat("Pizza");
    }

}
