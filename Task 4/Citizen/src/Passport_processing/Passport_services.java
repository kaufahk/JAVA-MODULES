package Passport_processing;
import Identification_management.*;
public class Passport_services {
    private ID_Services IDs= new ID_Services();
    private int Counter = 500;
    public Passportapplication apply(String NIN){
        National_ID k= IDs.Find(NIN);
        if (k==null){
            return null;
        }else {
            Counter++;
            return new Passportapplication("K"+Counter,k.getFullName());
        }
    }
}
