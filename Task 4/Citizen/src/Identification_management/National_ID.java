package Identification_management;

public class National_ID {
    private String NIN;
    private String FullName;

    public National_ID(String N, String F) {
        this.NIN = N;
        this.FullName = (F == null) ? "Unknown" : F;
    }

    public String getNIN() {
        return NIN;
    }

    public String getFullName() {
        return FullName;
    }
}