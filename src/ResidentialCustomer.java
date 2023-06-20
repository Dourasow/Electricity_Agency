class ResidentialCustomer extends Customer {


    public ResidentialCustomer(String clientId, String name, String meterNumber, String location) {
        super(clientId, name, meterNumber, location);
    }

    @Override
    public double calculateBill(double amountPaid) {
        if (amountPaid <= 0) {
            return 0;
        } else if (amountPaid <= 15) {
            return amountPaid * 89;
        } else if (amountPaid <= 50) {
            return amountPaid * 182;
        } else {
            return amountPaid * 189;
        }
    }

    @Override
    public double calculateVAT(double amountPaid) {
        return amountPaid * 0.18;
    }
}
