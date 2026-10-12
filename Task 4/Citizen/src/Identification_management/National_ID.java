package Identification_management;

public class National_ID {
    private String NIN;
    private String FullName;
    public National_ID(String N,String F){
        N = NIN;
        if (F==null){
            F ="Unknown";
        }
        else {
            F = FullName;
        }
    }
    public String getNIN() {
        return NIN;
    }

    public String getFullName() {
        return FullName;
    }
}
