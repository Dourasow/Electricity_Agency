class IndustrialCustomer extends Customer {

    private String industrySize;

    public IndustrialCustomer(String clientId, String name, String meterNumber, String location, String industrySize) {
        super(clientId, name, meterNumber, location);
        this.industrySize = industrySize;
    }

    public String getIndustrySize() {
        return industrySize;
    }

    @Override
    public double calculateBill(double amountPaid) {
        if (amountPaid <= 0) {
            return 0;
        } else if (industrySize.equalsIgnoreCase("small")) {
            return amountPaid * 126;
        } else if (industrySize.equalsIgnoreCase("medium")) {
            return amountPaid * 142;
        } else if (industrySize.equalsIgnoreCase("large")) {
            return amountPaid * 150;
        } else {
            return 0;
        }
    }

    @Override
    public double calculateVAT(double amountPaid) {
        return amountPaid * 0.18;
    }
}
