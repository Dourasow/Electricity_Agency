import java.util.HashMap;
import java.util.Map;

class ElectricityAgency {
    private Map<String, Customer> customers;

    public ElectricityAgency() {
        customers = new HashMap<>();
    }

    public void addCustomer(Customer customer) {
        customers.put(customer.getClientId(), customer);
    }

    public Customer getCustomerById(String clientId) {
        return customers.get(clientId);
    }

    public Customer getCustomerByMeterNumber(String meterNumber) {
        for (Customer customer : customers.values()) {
            if (customer.getMeterNumber().equals(meterNumber)) {
                return customer;
            }
        }
        return null;
    }
}