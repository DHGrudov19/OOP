import java.util.UUID;

public class Main {

    protected UUID address = UUID.randomUUID();

    public UUID getAddress() {
        return address;
    }

    public void setAddress(UUID address) {
        this.address = address;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}