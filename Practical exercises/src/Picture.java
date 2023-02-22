import java.util.Scanner;

public class Picture {

    private int id;
    private String name;
    protected String author;
    private double price;


    public Picture(int id, String name, String author, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Picture() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return getId()+" "+getName()+" "+getAuthor()+" "+getPrice();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int id = Integer.parseInt(scanner.nextLine());
         String name = scanner.nextLine();
         String author = scanner.nextLine();
         double price = Double.parseDouble(scanner.nextLine());
        Picture obj1 = new Picture(id,name,author,price);
        Picture obj2 = new Picture();
        obj2.setId(id);
        obj2.setName(name);
        obj2.setAuthor(author);
        obj2.setPrice(price);
        System.out.println(obj1);
    }
}
