public class Main {
    public static void main(String[] args) {

        ElectricityAgency agency = new ElectricityAgency();

        ResidentialCustomer rCustomer = new ResidentialCustomer("1", "Abdul Sow", "M123", "Residential Area");
        NonResidentialCustomer nrCustomer = new NonResidentialCustomer("2", "Abdul Company", "M456", "Commercial Area");
        IndustrialCustomer iCustomer = new IndustrialCustomer("3", "Abdul Industries", "M789", "Industrial Area", "large");

        agency.addCustomer(rCustomer);
        agency.addCustomer(nrCustomer);
        agency.addCustomer(iCustomer);

        Customer customer1 = agency.getCustomerById("1");
        if (customer1 != null) {
            System.out.println("Customer ID: " + customer1.getClientId());
            System.out.println("Name: " + customer1.getName());
            System.out.println("Meter Number: " + customer1.getMeterNumber());
            System.out.println("Location: " + customer1.getLocation());
        }

        Customer customer2 = agency.getCustomerByMeterNumber("M456");
        if (customer2 != null) {
            System.out.println("Customer ID: " + customer2.getClientId());
            System.out.println("Name: " + customer2.getName());
            System.out.println("Meter Number: " + customer2.getMeterNumber());
            System.out.println("Location: " + customer2.getLocation());
        }

        double amountPaid = 8700; // Example amount paid by the customer
        double bill = customer2.calculateBill(amountPaid);
        double vat = customer2.calculateVAT(amountPaid);

        System.out.println("Bill amount: " + bill);
        System.out.println("VAT amount: " + vat);
    }
}