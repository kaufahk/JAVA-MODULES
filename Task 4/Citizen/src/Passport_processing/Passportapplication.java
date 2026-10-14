package Passport_processing;

public class Passportapplication {
    private String passportNumber;
    private String holderName;

    public Passportapplication(String p, String h) {
        this.passportNumber = p;
        this.holderName = (h == null) ? "Unknown" : h;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public String getHolderName() {
        return holderName;
    }
}