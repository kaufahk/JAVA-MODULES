package Registration;

public class business {
    private String Name;
    private String OwnerName;
    public business(String N, String O){
        if (N==null){
            N = "Unnamed business";
        }else {
            N= Name;
        }
        O = OwnerName;
    }

    public String getName() {
        return Name;
    }

    public String getOwnerName() {
        return OwnerName;
    }
}
