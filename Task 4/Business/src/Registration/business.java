package Registration;

public class business {
    private String Name;
    private String OwnerName;

    public business(String N, String O) {
        this.Name = (N == null) ? "Unnamed business" : N;
        this.OwnerName = (O == null) ? "Unknown" : O;
    }

    public String getName() {
        return Name;
    }

    public String getOwnerName() {
        return OwnerName;
    }
}