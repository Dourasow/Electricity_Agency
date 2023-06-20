import java.util.HashMap;
import java.util.Map;

abstract class Customer {

    private String clientId;
    private String name;
    private String meterNumber;
    private String location;

    public Customer(String clientId, String name, String meterNumber, String location) {
        this.clientId = clientId;
        this.name = name;
        this.meterNumber = meterNumber;
        this.location = location;
    }

    public String getClientId() {
        return clientId;
    }

    public String getName() {
        return name;
    }

    public String getMeterNumber() {
        return meterNumber;
    }

    public String getLocation() {
        return location;
    }

    public abstract double calculateBill(double amountPaid);

    public abstract double calculateVAT(double amountPaid);
}