package Tax;
import Registration.*;
public class Tax_Services {
    public Tax_receipt fileTax(business busy,double income){
        if (busy==null){
            return null;
        }
        else if (income<=0){
            return null;
        }
        else {
            return new Tax_receipt(busy.getName(), income*0.30);
        }
    }
}
