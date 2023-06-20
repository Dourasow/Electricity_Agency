class NonResidentialCustomer extends Customer {


    public NonResidentialCustomer(String clientId, String name, String meterNumber, String location) {
        super(clientId, name, meterNumber, location);
    }

    @Override
    public double calculateBill(double amountPaid) {
        if (amountPaid <= 0) {
            return 0;
        } else if (amountPaid <= 100) {
            return amountPaid * 189;
        } else {
            return amountPaid * 192;
        }
    }

    @Override
    public double calculateVAT(double amountPaid) {
        return amountPaid * 0.18;
    }
}