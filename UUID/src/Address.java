import java.util.UUID;

public class Address extends Main{
    private UUID addressId = super.address;

    public UUID getAddressId() {
        return addressId;
    }

    public void setAddressId(UUID addressId) {
        this.addressId = addressId;
    }

    public static void main(String[] args) {
        Address obj = new Address();
        System.out.println(obj.getAddress());
        System.out.println(obj.getAddressId());
    }
}
