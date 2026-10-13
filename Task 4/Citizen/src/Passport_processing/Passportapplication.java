package Passport_processing;

public class Passportapplication {
    private String passportNumber;
    private String holderName;
    public Passportapplication(String p,String h){
        p = passportNumber;
        if (h == null){
            h = "Unknown";
        }else {
            h = holderName;
        }
    }
    public String getPassportNumber() {
        return passportNumber;
    }

    public String getHolderName() {
        return holderName;
    }
}
