class Lamp
{

    private String color;

    public void turnOn()
    {
        System.out.println("Lamp is on!");
    }

    public void turnOf()
    {
        System.out.println("Lamp is of!");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

public class Main {
    public static void main(String[] args) {
        Lamp firstLamp = new Lamp();
        String color = "Red";
        firstLamp.setColor(color);
        firstLamp.getColor();
        firstLamp.turnOn();
        firstLamp.turnOf();
    }


}
