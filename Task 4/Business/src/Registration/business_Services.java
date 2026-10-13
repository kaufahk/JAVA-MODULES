package Registration;
import Identification_management.*;
public class business_Services {
    private ID_Services k = new ID_Services();
    public business Register(String businessName,String OwnerNIN){
        National_ID Owner = k.Find(OwnerNIN);
        if(Owner==null){
            return null;
        }else {
            return new business(businessName,Owner.getFullName());
        }
    }
}
