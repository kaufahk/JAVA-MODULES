package Tax;

public class Tax_receipt {
    private String businessName;
    private double Amount;
    public Tax_receipt(String b,double A){
        b=businessName;
        if (Amount < 0){
            A=0;
        }else {
            A=Amount;
        }
    }
    public String getBusinessName() {
        return businessName;
    }

    public double getAmount() {
        return Amount;
    }
}
