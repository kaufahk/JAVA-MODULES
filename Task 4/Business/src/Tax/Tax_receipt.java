package Tax;

public class Tax_receipt {
    private String businessName;
    private double Amount;

    public Tax_receipt(String b, double A) {
        this.businessName = b;
        this.Amount = (A < 0) ? 0 : A;
    }

    public String getBusinessName() {
        return businessName;
    }

    public double getAmount() {
        return Amount;
    }
}